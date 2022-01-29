package com.youtube.customsearchapi.service;

import com.youtube.customsearchapi.dao.YoutubeVideoMetaDataDao;
import com.youtube.customsearchapi.model.GetYoutubeVideoSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YoutubeSearchApiServiceImpl implements YoutubeSearchApiService {

    @Autowired
    private YoutubeVideoMetaDataDao youtubeVideoMetaDataDao;

    @Override
    public GetYoutubeVideoSearchResponse getSearchResult(String q, long limit, long page) {
        GetYoutubeVideoSearchResponse getYoutubeVideoSearchResponse = new GetYoutubeVideoSearchResponse();
        long totalVideos = youtubeVideoMetaDataDao.getYoutubeVideoMetaDataCount(q);
        evaluatePagination(totalVideos, limit, page, getYoutubeVideoSearchResponse);
        getYoutubeVideoSearchResponse.setVideoMetaData(youtubeVideoMetaDataDao.getYoutubeVideoMetaData(q, limit, page));
        return getYoutubeVideoSearchResponse;
    }

    private void evaluatePagination(long totalVideos, long limit, long currentPage, GetYoutubeVideoSearchResponse getYoutubeVideoSearchResponse) {
        getYoutubeVideoSearchResponse.setTotalVideos(totalVideos);
        long nextPage = currentPage;
        if (currentPage * limit >= totalVideos) {
            nextPage = -1;
        } else {
            nextPage = nextPage + 1;
        }
        getYoutubeVideoSearchResponse.setNextPage(Math.toIntExact(nextPage));
    }
}
