package com.youtube.customsearchapi.validator;

public class ValidationResult {

    private boolean isNewVideo;

    public ValidationResult() {
    }

    public ValidationResult(boolean isNewVideo) {
        this.isNewVideo = isNewVideo;
    }

    public boolean isNewVideo() {
        return isNewVideo;
    }

    public void setNewVideo(boolean newVideo) {
        isNewVideo = newVideo;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "isNewVideo=" + isNewVideo +
                '}';
    }
}
