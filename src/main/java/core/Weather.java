package core;

public class Weather {


    private String city;
    private String country;
    private String lat;
    private String lon;
    private Integer temperature;


    public Weather(String city, String country, String lat, String lon, Integer temperature) {
        this.city = city;
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
