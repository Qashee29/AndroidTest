package com.example.wangshuo.startproject_205ws.service;

import com.example.wangshuo.startproject_205ws.bean.WeatherResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by wangshuo on 2017/3/15.
 */
//Retrofit访问网络的接口
public interface WeatherService {
    @GET("data/sk/{cityNumber}.html")
    Call<WeatherResult>getResult(@Path("cityNumber")String cityNumber);



}
