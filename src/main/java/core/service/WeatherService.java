package core.service;

import core.Weather;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WeatherService {

    Weather get(String city) throws Exception;

}
