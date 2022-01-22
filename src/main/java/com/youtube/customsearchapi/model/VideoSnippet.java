package com.youtube.customsearchapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;

public class VideoSnippet {

    private Instant publishedAt;
    @JsonIgnore
    private String channelTitle;
    private String title;
    private String description;
    private Thumbnail thumbnails;
    private Instant publishTime;

    public VideoSnippet(){}

    public VideoSnippet(Instant publishedAt, String channelTitle, String title, String description, Thumbnail thumbnail, Instant publishTime) {
        this.publishedAt = publishedAt;
        this.channelTitle = channelTitle;
        this.title = title;
        this.description = description;
        this.thumbnails = thumbnail;
        this.publishTime = publishTime;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
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

    public Thumbnail getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnail thumbnails) {
        this.thumbnails = thumbnails;
    }

    public Instant getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Instant publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString() {
        return "YoutubeVideoSnippet{" +
                "publishedAt=" + publishedAt +
                ", channelTitle='" + channelTitle + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnails=" + thumbnails +
                ", publishTime=" + publishTime +
                '}';
    }
}
