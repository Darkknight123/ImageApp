package com.example.imageapp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("")
    Call<ResponsePOJO> uploadImage(
            @Field("EN_IMAGE") String encodedImage
    );
}
