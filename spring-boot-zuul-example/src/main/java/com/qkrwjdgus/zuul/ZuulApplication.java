package com.qkrwjdgus.zuul;

import com.qkrwjdgus.zuul.config.RequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZuulApplication.class, args);
  }

  @Bean
  public RequestLogFilter simpleFilter() {
    return new RequestLogFilter();
  }

}
