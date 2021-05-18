package com.example.wangshuo.startproject_205ws.model;

import com.example.wangshuo.startproject_205ws.bean.WeatherResult;
import com.example.wangshuo.startproject_205ws.iface.WeatherListener;
import com.example.wangshuo.startproject_205ws.iface.Weatheriface;
import com.example.wangshuo.startproject_205ws.service.WeatherService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wangshuo on 2017/3/14.
 */

public class WeatherModel implements Weatheriface {
    private Retrofit retrofit;
    private String BASEURL="http://www.weather.com.cn/";
    private WeatherService weatherService;
   public  WeatherModel(){
       //Retrofit使用3-1

       retrofit=new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();
   }
    @Override
    public void getWeather(String cityno, final WeatherListener listener) {
        //Retrofit使用3-2

        weatherService=retrofit.create(WeatherService.class);
        Call<WeatherResult> call=weatherService.getResult(cityno);
        //Retrofit使用3-3

        call.enqueue(new Callback<WeatherResult>() {
            @Override
            public void onResponse(Call<WeatherResult> call, Response<WeatherResult> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    listener.onResponse(response.body().getWeatherinfo());
                }else
                    listener.onFail("onResponse fail");
            }
            @Override
            public void onFailure(Call<WeatherResult> call, Throwable t) {
                listener.onFail(t.toString());

            }
        });

    }
}
