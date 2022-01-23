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

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "YoutubeSearchResultDTO{" +
                ", nextPageToken='" + nextPageToken + '\'' +
                ", youtubeVideoMetaData=" + items +
                '}';
    }
}
