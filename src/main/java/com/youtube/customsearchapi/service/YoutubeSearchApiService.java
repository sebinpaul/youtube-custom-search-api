package com.youtube.customsearchapi.service;

import com.youtube.customsearchapi.dto.YoutubeSearchResultDto;

public interface YoutubeSearchApiService {

    YoutubeSearchResultDto getSearchResult(String query);
}
