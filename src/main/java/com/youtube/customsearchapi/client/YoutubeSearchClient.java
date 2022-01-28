package com.youtube.customsearchapi.client;

import com.youtube.customsearchapi.dao.YoutubeVideoMetaDataDao;
import com.youtube.customsearchapi.dto.YoutubeSearchResultDto;
import com.youtube.customsearchapi.model.Items;
import com.youtube.customsearchapi.model.VideoId;
import com.youtube.customsearchapi.model.VideoSnippet;
import com.youtube.customsearchapi.model.YoutubeVideoMetaData;
import com.youtube.customsearchapi.validator.MetaDataValidator;
import com.youtube.customsearchapi.validator.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class YoutubeSearchClient {

    private final String BASE_URL = "https://www.googleapis.com/youtube/v3/search";
    private final String API_KEY = "AIzaSyBg2koUNLBhlQtbhhj9pRl5M2b1vJMGouQ";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private YoutubeVideoMetaDataDao youtubeVideoMetaDataDao;

    @Autowired
    private MetaDataValidator metaDataValidator;

    @Scheduled(fixedRate = 10000)
    public void fetchResultsFromYoutubeInBackground() {
        String query = BASE_URL + "?key=" + API_KEY + "&&q=cricket" + "&&maxResults=25&&part=snippet&&publishedAfter=2019-09-16T14:30:06Z";
        YoutubeSearchResultDto youtubeSearchResultDTO = restTemplate.getForObject(query, YoutubeSearchResultDto.class);
        if (youtubeSearchResultDTO != null) {
            List<Items> metaDataList = youtubeSearchResultDTO.getItems();
            List<YoutubeVideoMetaData> youtubeVideoMetaDataList = new ArrayList<>();
            for (Items items : metaDataList) {
                ValidationResult validationResult = metaDataValidator.validate(items);
                if (!validationResult.isNewVideo()) {
                    continue;
                }
                VideoId videoId = items.getId();
                VideoSnippet videoSnippet = items.getSnippet();
                YoutubeVideoMetaData youtubeVideoMetaData = new YoutubeVideoMetaData(videoId.getVideoId(), videoSnippet.getTitle(), videoSnippet.getDescription(), videoSnippet.getPublishTime(), videoSnippet.getThumbnails());
                youtubeVideoMetaDataList.add(youtubeVideoMetaData);
            }
            youtubeVideoMetaDataDao.saveYoutubeVideoMetaData(youtubeVideoMetaDataList);
        }

    }


}
