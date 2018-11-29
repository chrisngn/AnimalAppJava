package com.example.songbird.animalappjava;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PixabayResponse {

    @SerializedName("hits")
    private List<Photo> photos;

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
