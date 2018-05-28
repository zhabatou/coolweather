package com.example.coolweather.gson;

/**
 * Created by haha on 2018/5/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
