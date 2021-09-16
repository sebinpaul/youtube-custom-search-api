package com.youtube.customsearchapi.service;

import com.youtube.customsearchapi.model.YoutubeDataDTO;

public interface YoutubeSearchApiService {

    YoutubeDataDTO getVideoData(String query);
}
