package com.youtube.customsearchapi.misc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youtube.customsearchapi.dto.YoutubeSearchResultDto;
import org.springframework.beans.factory.annotation.Autowired;

public class ResponseObj {

    private boolean result;

    @Autowired
    private YoutubeSearchResultDto youtubeSearchResultDTO;

    public ResponseObj(boolean result, YoutubeSearchResultDto youtubeSearchResultDTO) {
        this.result = result;
        this.youtubeSearchResultDTO = youtubeSearchResultDTO;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @JsonProperty("data")
    public YoutubeSearchResultDto getYoutubeDataDTO() {
        return youtubeSearchResultDTO;
    }

    public void setYoutubeDataDTO(YoutubeSearchResultDto youtubeSearchResultDTO) {
        this.youtubeSearchResultDTO = youtubeSearchResultDTO;
    }

    @Override
    public String toString() {
        return "ResponseObj{" +
                "result='" + result + '\'' +
                ", youtubeSearchResultDTO=" + youtubeSearchResultDTO +
                '}';
    }
}
