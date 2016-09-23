import static org.junit.Assert.*;

import org.junit.Test;
import org.ssa.ironyard.WeatherService;

public class ServiceTest {

    WeatherService service = new WeatherService();
//    @Test
    public void test() {
        fail("Not yet implemented");
    }
    
    @Test
    public void getJSONTest()
    {
       System.out.println(service.searchCityName("Baltimore"));
    }

}
