package com.infy.ms.rest.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
//@EnableDiscoveryClient
public class ForecastMsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ForecastMsApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ForecastMsApplication.class, args);
    }

}
