package com.youtube.customsearchapi.misc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youtube.customsearchapi.dto.YoutubeSearchResultDto;
import org.springframework.beans.factory.annotation.Autowired;

public class ResponseObj {

    private boolean result;

    private Object object;

    public ResponseObj(boolean result, Object object) {
        this.result = result;
        this.object = object;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @JsonProperty("data")
    public Object getYoutubeDataDTO() {
        return object;
    }

    public void setYoutubeDataDTO(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ResponseObj{" +
                "result='" + result + '\'' +
                ", youtubeSearchResultDTO=" + object +
                '}';
    }
}
