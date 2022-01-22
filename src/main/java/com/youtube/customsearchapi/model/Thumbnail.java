package com.youtube.customsearchapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnail {

    @JsonProperty("default")
    private DefaultThumbnail defaultThumbnail;
    @JsonProperty("medium")
    private MediumThumbnail mediumThumbnail;
    @JsonProperty("high")
    private HighThumbnail highThumbnail;

    public Thumbnail(){}

    public Thumbnail(DefaultThumbnail defaultThumbnail, MediumThumbnail mediumThumbnail, HighThumbnail highThumbnail) {
        this.defaultThumbnail = defaultThumbnail;
        this.mediumThumbnail = mediumThumbnail;
        this.highThumbnail = highThumbnail;
    }

    public DefaultThumbnail getDefaultThumbnail() {
        return defaultThumbnail;
    }

    public void setDefaultThumbnail(DefaultThumbnail defaultThumbnail) {
        this.defaultThumbnail = defaultThumbnail;
    }

    public MediumThumbnail getMediumThumbnail() {
        return mediumThumbnail;
    }

    public void setMediumThumbnail(MediumThumbnail mediumThumbnail) {
        this.mediumThumbnail = mediumThumbnail;
    }

    public HighThumbnail getHighThumbnail() {
        return highThumbnail;
    }

    public void setHighThumbnail(HighThumbnail highThumbnail) {
        this.highThumbnail = highThumbnail;
    }

    @Override
    public String toString() {
        return "Thumbnail{" +
                "defaultThumbnail=" + defaultThumbnail +
                ", mediumThumbnail=" + mediumThumbnail +
                ", highThumbnail=" + highThumbnail +
                '}';
    }
}
