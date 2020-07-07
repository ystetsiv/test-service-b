package core;


import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class HttpClient {

    private final CloseableHttpClient httpClient = HttpClients.createDefault();


    public Weather sendGet(String city) throws Exception {

        HttpGet request = new HttpGet("http://api.weatherstack.com/current?access_key=efcc2bc8fc2cc297e3161027b67355a0&query=" + city);

        // add request headers
        //request.addHeader("custom-key", "mkyong");
        //request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");

        try (CloseableHttpResponse response = httpClient.execute(request)) {

            // Get HttpResponse Status
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            String result = null;

            if (entity != null) {
                // return it as a String
                 result= EntityUtils.toString(entity);
                System.out.println("testtttttt " + result);
            }


            JSONObject json = new JSONObject(result);
            String name = json.getJSONObject("location").getString("name");
            String country = json.getJSONObject("location").getString("country");
            String lat = json.getJSONObject("location").getString("lat");
            String lon = json.getJSONObject("location").getString("lon");
            Integer temperature = json.getJSONObject("current").getInt("temperature");

            return new Weather(name, country,lat,lon, temperature);

        }

    }
}
