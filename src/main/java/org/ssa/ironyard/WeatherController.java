package org.ssa.ironyard;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@RestController
@RequestMapping("/weather")
public class WeatherController {


     WeatherService service;
    
    @Autowired
    public WeatherController(WeatherService service)
    {
        this.service = service;
    }
    
    @RequestMapping(value = "")
    
    public View home()
    {
        return new InternalResourceView("weatherfile.html");
   
    }
    
    @RequestMapping(produces = "application/json", value ="/search/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<HashMap<String, List<?>>> byCityName(@PathVariable String name)
    {
       ResponseEntity.status(HttpStatus.CREATED);
       HashMap<String ,List<?>> map = new HashMap<String, List<?>>();
       Result result = service.searchCityName(name);
       
       if(result.weather.size() == 0)
       {
           map.put("error", result.weather);
           return ResponseEntity.ok().header("Weather App", "Results").body(map);
       }
    
       else
       {
           map.put("success", result.weather);
           return ResponseEntity.ok().header("Weather App", "Results").body(map);
       }
       
       
    }
    
    
}
