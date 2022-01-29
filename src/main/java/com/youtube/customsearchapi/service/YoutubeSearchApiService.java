package com.youtube.customsearchapi.service;

import com.youtube.customsearchapi.model.GetYoutubeVideoSearchResponse;

public interface YoutubeSearchApiService {

    GetYoutubeVideoSearchResponse getSearchResult(String query, long limit, long page);
}
