package com.youtube.customsearchapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.youtube.customsearchapi.model.Items;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YoutubeSearchResultDto {

    private String nextPageToken;
    private List<Items> items;

    public YoutubeSearchResultDto() {
    }

    public YoutubeSearchResultDto(String nextPageToken, List<Items> youtubeVideoMetaData) {
        this.nextPageToken = nextPageToken;
        this.items = youtubeVideoMetaData;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public List<Items> getYoutubeVideoMetaData() {
        return items;
    }

    public void setYoutubeVideoMetaData(List<Items> youtubeVideoMetaData) {
        this.items = youtubeVideoMetaData;
    }

    @Override
    public String toString() {
        return "YoutubeSearchResultDTO{" +
                ", nextPageToken='" + nextPageToken + '\'' +
                ", youtubeVideoMetaData=" + items +
                '}';
    }
}
