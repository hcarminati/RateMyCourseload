package com.carminati.ratemycourseload.models;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseConfig {

  @Bean
  CommandLineRunner commandLineRunner(CourseRepository repository) {
    return args -> {

    };
  }
}
