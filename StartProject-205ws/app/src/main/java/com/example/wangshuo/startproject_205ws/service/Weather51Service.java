package com.example.wangshuo.startproject_205ws.service;

import com.example.wangshuo.startproject_205ws.bean.WeatherResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wangshuo on 2017/3/15.
 */

public interface Weather51Service {
    @GET("GetMoreWeather")
    Call<WeatherResult>  getResult(@Query("cityCode")String cityNumber,@Query("weatherType")int weatherType);

}
