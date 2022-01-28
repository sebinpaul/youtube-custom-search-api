package com.youtube.customsearchapi.validator;

import com.youtube.customsearchapi.model.Items;
import com.youtube.customsearchapi.model.YoutubeVideoMetaData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class YoutubeVideoIdValidator implements MetaDataValidator {

    Logger LOGGER = LoggerFactory.getLogger(YoutubeVideoIdValidator.class.getName());

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public ValidationResult validate(Items items) {
        Query query = new Query();
        query.addCriteria(Criteria.where("videoId").is(items.getId().getVideoId()));
        ValidationResult validationResult = new ValidationResult();
        validationResult.setNewVideo(true);
        if (mongoTemplate.count(query, YoutubeVideoMetaData.class) > 0) {
            validationResult.setNewVideo(false);
        }
        if (validationResult.isNewVideo()) {
            LOGGER.info("Found new video with video Id- {} ", items.getId().getVideoId());
        }
        return validationResult;
    }
}
