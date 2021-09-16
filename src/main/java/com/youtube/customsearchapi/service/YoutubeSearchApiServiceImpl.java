package com.youtube.customsearchapi.service;

import com.youtube.customsearchapi.model.YoutubeDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class YoutubeSearchApiServiceImpl implements YoutubeSearchApiService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public YoutubeDataDTO getVideoData(String query) {
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("key", "AIzaSyANzCLXoWh3PUWt_Yuq8X2dgTomwGUl3GA");
//        params.put("query", query);
        YoutubeDataDTO youtubeDataDTO = restTemplate.getForObject(
                "https://www.googleapis.com/youtube/v3/search?key=AIzaSyANzCLXoWh3PUWt_Yuq8X2dgTomwGUl3GA&&query=" + query, YoutubeDataDTO.class);
        System.out.println(youtubeDataDTO.toString());
        return youtubeDataDTO;
    }
}
