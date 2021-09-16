package com.youtube.customsearchapi.misc;

import com.youtube.customsearchapi.model.YoutubeDataDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class ResponseObj {

    private boolean result;

    @Autowired
    private YoutubeDataDTO youtubeDataDTO;

    public ResponseObj(boolean result, YoutubeDataDTO youtubeDataDTO) {
        this.result = result;
        this.youtubeDataDTO = youtubeDataDTO;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public YoutubeDataDTO getYoutubeDataDTO() {
        return youtubeDataDTO;
    }

    public void setYoutubeDataDTO(YoutubeDataDTO youtubeDataDTO) {
        this.youtubeDataDTO = youtubeDataDTO;
    }

    @Override
    public String toString() {
        return "ResponseObj{" +
                "result='" + result + '\'' +
                ", youtubeDataDTO=" + youtubeDataDTO +
                '}';
    }
}
