package com.example.songbird.animalappjava;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CatClient {
    private static final String BASE_URL = "https://pixabay.com";
    private static CatClient catClient;
    private CatService catService;

    public static CatService instance() {
        if (catClient == null) {
            catClient = new CatClient();
        }
        return catClient.catService;
    }

    public CatClient() {
        setupCatClient();
    }

    private void setupCatClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(logging).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        catService = retrofit.create(CatService.class);
    }

}
