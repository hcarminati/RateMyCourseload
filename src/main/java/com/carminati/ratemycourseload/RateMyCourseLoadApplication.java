package com.carminati.ratemycourseload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RateMyCourseLoadApplication {

  @GetMapping("/message")
  public String message() {
    return "Test message: your app deployed succesffully in Azure.";
  }

  public static void main(String[] args) {
    SpringApplication.run(RateMyCourseLoadApplication.class, args);
  }

}
