package core.service;

import core.HttpClient;
import core.Weather;
import org.springframework.beans.factory.annotation.Autowired;

public class WeatherImpl implements WeatherService {

    @Autowired
    private HttpClient httpClient;

    @Override
    public Weather get(String city) throws Exception {

        return httpClient.sendGet(city);
    }

}
