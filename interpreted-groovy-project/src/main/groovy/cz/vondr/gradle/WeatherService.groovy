package cz.vondr.gradle

import com.jcabi.http.Response
import com.jcabi.http.request.JdkRequest

class WeatherService {
    private String city

    WeatherService(String city) {
        this.city = city
    }

    String getForecast() {
        String apiKey = "964ad29041e1040dee5df17d3e57d62a"
        Response response = new JdkRequest("http://api.openweathermap.org/data/2.5/weather?q=${city}&APPID=$apiKey")
                .fetch()
        response.toString()
    }
}
