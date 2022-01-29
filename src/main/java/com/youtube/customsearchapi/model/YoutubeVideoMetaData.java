package com.youtube.customsearchapi.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
public class YoutubeVideoMetaData {
    private String videoId;
    @Indexed
    private String title;
    private String description;
    private Instant publishTime;
    private Thumbnail thumbnail;

    public YoutubeVideoMetaData(String videoId, String title, String description, Instant publishTime, Thumbnail thumbnail) {
        this.videoId = videoId;
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

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
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
