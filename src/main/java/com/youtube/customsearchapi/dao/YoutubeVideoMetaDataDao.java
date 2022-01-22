package com.youtube.customsearchapi.dao;

import com.youtube.customsearchapi.model.YoutubeVideoMetaData;

import java.util.List;

public interface YoutubeVideoMetaDataDao{

    void saveYoutubeVideoMetaData(List<YoutubeVideoMetaData> youtubeVideoMetaDataList);

    List<YoutubeVideoMetaData> getYoutubeVideoMetaData(String query);
}
