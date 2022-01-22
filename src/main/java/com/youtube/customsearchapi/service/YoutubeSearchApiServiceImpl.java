package com.youtube.customsearchapi.service;

import com.youtube.customsearchapi.dao.YoutubeVideoMetaDataDao;
import com.youtube.customsearchapi.model.YoutubeVideoMetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YoutubeSearchApiServiceImpl implements YoutubeSearchApiService {

    @Autowired
    private YoutubeVideoMetaDataDao youtubeVideoMetaDataDao;

    @Override
    public List<YoutubeVideoMetaData> getSearchResult(String q) {
        return youtubeVideoMetaDataDao.getYoutubeVideoMetaData(q);
    }
}
