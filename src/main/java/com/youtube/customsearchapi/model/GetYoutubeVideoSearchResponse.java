package com.youtube.customsearchapi.model;

public class GetYoutubeVideoSearchResponse {
    private Object videoMetaData;
    private long totalVideos;
    private int nextPage;

    public GetYoutubeVideoSearchResponse(){

    }

    public long getTotalVideos() {
        return totalVideos;
    }

    public void setTotalVideos(long totalVideos) {
        this.totalVideos = totalVideos;
    }

    public Object getVideoMetaData() {
        return videoMetaData;
    }

    public void setVideoMetaData(Object videoMetaData) {
        this.videoMetaData = videoMetaData;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    @Override
    public String toString() {
        return "GetYoutubeVideoSearchResponse{" +
                "totalVideos=" + totalVideos +
                ", data=" + videoMetaData +
                ", nextPage=" + nextPage +
                '}';
    }
}
