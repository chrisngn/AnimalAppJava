package com.example.songbird.animalappjava;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface CatService {
    @GET("api?key=9039512-dec434f0a88ad706feb85ae64" +
            "&q=animal" +
            "&image_type=photo")
    Call<PixabayResponse> getImages(@Query("q") String query);

    @GET("//cat-fact.herokuapp.com/facts")
    Call<CatFactResponse> getFacts();
}
