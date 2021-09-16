package com.youtube.customsearchapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeDataDTO {

    private String kind;
    private String title;
    private String description;
    private Date publishedDate;
    private String thumbnailURL;

    public YoutubeDataDTO(String kind, String title, String description, Date publishedDate, String thumbnailURL) {
        this.kind = kind;
        this.title = title;
        this.description = description;
        this.publishedDate = publishedDate;
        this.thumbnailURL = thumbnailURL;
    }

    public String getId() {
        return kind;
    }

    public void setId(String id) {
        this.kind = id;
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

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }

    @Override
    public String toString() {
        return "YoutubeDataDTO{" +
                "kind='" + kind + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishedDate=" + publishedDate +
                ", thumbnailURL='" + thumbnailURL + '\'' +
                '}';
    }
}
