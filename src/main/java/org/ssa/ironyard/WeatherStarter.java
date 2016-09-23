package org.ssa.ironyard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


    @SpringBootApplication
    public class WeatherStarter 
    {
   //     static Logger LOGGER = LogManager.getLogger(BankStarter.class);

        public static void main(String[] args)
        {
         //   LOGGER.info("Starting application ssa-bank");
            SpringApplication.run(WeatherStarter.class, args);
        }
    }

