package com.qkrwjdgus.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringApiApplication.class, args);
  }

  @RequestMapping(value = "/zuul")
  public String available() {
    return "zuul";
  }

}
