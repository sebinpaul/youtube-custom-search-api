package com.youtube.customsearchapi.model;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Date;

@Document
public class YoutubeVideoMetaData {
    String title;
    String description;
    Instant publishTime;
    Thumbnail thumbnail;

    public YoutubeVideoMetaData(String title, String description, Instant publishTime, Thumbnail thumbnail) {
        this.title = title;
        this.description = description;
        this.publishTime = publishTime;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Instant publishTime) {
        this.publishTime = publishTime;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "YoutubeVideoMetaData{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishTime=" + publishTime +
                ", thumbnail=" + thumbnail +
                '}';
    }
}
