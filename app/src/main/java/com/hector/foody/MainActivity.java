package com.hector.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hector.foody.API.MyAPI;
import com.hector.foody.API.RetrofitClient;
import com.hector.foody.DataModels.APIResponse;
import com.hector.foody.DataModels.Banners;
import com.hector.foody.DataModels.Categories;
import com.hector.foody.DataModels.FetechedData;
import com.hector.foody.DataModels.FreshProducts;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String TAG = "API Client";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchData();
    }

    private void fetchData() {
        MyAPI myAPI = RetrofitClient.getInstance().create(MyAPI.class);
        Call<APIResponse> call = myAPI.getResponse();
        call.enqueue(new Callback<APIResponse>() {
            @Override
            public void onResponse(Call<APIResponse> call, Response<APIResponse> response) {
                displayData(response.body().getData());
            }

            @Override
            public void onFailure(Call<APIResponse> call, Throwable t) {
                Log.d(TAG, "Failed :-( \n Error :: "+ t.getMessage());
            }
        });
    }

    private void displayData(FetechedData data) {
        Log.d(TAG, "Successful :-)");

        ArrayList<Banners> bannersArrayList = data.getBanners();
        ArrayList<Categories> categoriesArrayList = data.getCategories();
        ArrayList<FreshProducts> freshProductsArrayList = data.getFresh_products();

        Log.d(TAG, "Banner Image URL");
        for (int i=0; i < bannersArrayList.size(); i++)
            Log.d(TAG, "URL-"+i+1+": "+bannersArrayList.get(i).getImage());

        Log.d(TAG, "Category");
        for (int i=0; i < categoriesArrayList.size(); i++)
            Log.d(TAG, i+1+": cat-"+categoriesArrayList.get(i).getName()+" imgURL-"+categoriesArrayList.get(i).getImage());

        Log.d(TAG, "FreshProducts");
        for (int i=0; i < freshProductsArrayList.size(); i++)
            Log.d(TAG, i+1+": Name: "+freshProductsArrayList.get(i).getName()+" imgURL: "+freshProductsArrayList.get(i).getImage());

    }
}