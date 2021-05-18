package com.example.wangshuo.startproject_205ws.iface;

import com.example.wangshuo.startproject_205ws.bean.WeatherInfo;

/**
 * Created by wangshuo on 2017/3/14.
 */

public interface WeatherListener {
    void onResponse(WeatherInfo weatherinfo);
    void onFail(String msg);
}
