package org.ssa.ironyard;
import java.util.List;
import java.util.Map;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    RestTemplate template = new RestTemplate();
    
    String uri = "http://api.openweathermap.org/data/2.5/weather?q=";
    String apiKey= "&APPID=cddc5352d9053bf34d6bd2051c6c125e";
   
    
    public WeatherService()
    {
  
    }
    
    public Result searchCityName(String city)
    {
    
        return template.getForObject(uri + city + apiKey,Result.class);
       
        
      
        
    }
}
