package com.youtube.customsearchapi.dao;

import com.youtube.customsearchapi.model.YoutubeVideoMetaData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class YoutubeVideoMetaDataDaoImpl implements YoutubeVideoMetaDataDao {

    Logger LOGGER = LoggerFactory.getLogger(YoutubeVideoMetaDataDaoImpl.class.getName());

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void saveYoutubeVideoMetaData(List<YoutubeVideoMetaData> youtubeVideoMetaData) {
        List<YoutubeVideoMetaData> response = (List<YoutubeVideoMetaData>) mongoTemplate.insertAll(youtubeVideoMetaData);
        LOGGER.info("Successfully saved new Youtube videos metadata - {} ", response);
    }

    @Override
    public List<YoutubeVideoMetaData> getYoutubeVideoMetaData(String searchQuery) {
        Query query = new Query();
        query.addCriteria(Criteria.where("title").regex(searchQuery, "i"));
        query.addCriteria(Criteria.where("description").regex(searchQuery, "i"));
        return mongoTemplate.find(query, YoutubeVideoMetaData.class);
    }
}
