package com.youtube.customsearchapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.temporal.ChronoUnit;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Items implements Comparable<Items> {

    private VideoSnippet snippet;

    public Items() {}

    public Items(VideoSnippet youtubeVideoSnippet) {
        this.snippet = youtubeVideoSnippet;
    }

    public VideoSnippet getSnippet() {
        return snippet;
    }

    public void setSnippet(VideoSnippet snippet) {
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return "YoutubeVideoMetaData{" +
                ", snippet=" + snippet +
                '}';
    }

    @Override
    public int compareTo(Items items) {
       if(items.getSnippet().getPublishTime().truncatedTo(ChronoUnit.DAYS).isAfter(snippet.getPublishTime().truncatedTo(ChronoUnit.DAYS))){
            return -1;
        }
       return 1;
    }
}
