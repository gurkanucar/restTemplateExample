package com.gucarsoft.resttemplateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateExampleApplication {

    private final ResponseErrorHandler responseErrorHandler;

    public RestTemplateExampleApplication(ResponseErrorHandler responseErrorHandler) {
        this.responseErrorHandler = responseErrorHandler;
    }

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateExampleApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplateBuilder().errorHandler(responseErrorHandler).build();
    }
}
