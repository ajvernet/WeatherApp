package org.ssa.ironyard;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    List<Map<?,?>> weather = new ArrayList<Map<?, ?>>();
    
    public Result()
    {
        
    }

    public List<Map<?, ?>> getWeather() {
        return weather;
    }

    public void setWeather(List<Map<?, ?>> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Result [weather=" + weather + "]";
    }
    
    
}
