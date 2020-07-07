package core;

import core.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Weather getWeather(@RequestParam String city) throws Exception {
        return weatherService.get(city);
    }

}
