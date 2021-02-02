package com.hector.foody.API;

import com.hector.foody.DataModels.APIResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPI {
    @GET("index.php?route=api/common")
    Call<APIResponse> getResponse();
}
