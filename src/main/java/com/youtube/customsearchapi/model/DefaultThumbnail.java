package com.youtube.customsearchapi.model;

public class DefaultThumbnail {
    private String url;
    private Integer width;
    private Integer height;

    public DefaultThumbnail(){}

    public DefaultThumbnail(String url, Integer width, Integer height) {
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "DefaultThumbnail{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
