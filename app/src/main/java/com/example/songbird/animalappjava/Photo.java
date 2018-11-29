package com.example.songbird.animalappjava;

import com.google.gson.annotations.SerializedName;

public class Photo {
    @SerializedName("previewURL")
    private String previewUrl;

    @SerializedName("webformatURL")
    private String webUrl;

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
}
