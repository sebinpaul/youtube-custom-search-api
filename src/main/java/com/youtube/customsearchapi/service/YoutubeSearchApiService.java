package com.youtube.customsearchapi.service;

import com.youtube.customsearchapi.dto.YoutubeSearchResultDto;
import com.youtube.customsearchapi.model.YoutubeVideoMetaData;

import java.util.List;

public interface YoutubeSearchApiService {

    List<YoutubeVideoMetaData> getSearchResult(String query);
}
