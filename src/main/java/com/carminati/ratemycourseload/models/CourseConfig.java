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
      Course testCourse1 = new Course(1L, "subject", "courseNumber",
              "attributes", "college", "semesterName",
              "semesterYear", "profFirstName",
              "profLastName", 4);
      Course testCourse2 = new Course( "subject2", "courseNumber2",
              "attributes2", "college2", "semesterName2",
              "semesterYear2", "profFirstName2",
              "profLastName2", 2);

      repository.saveAll(
              List.of(testCourse1, testCourse2)
      );

    };
  }
}
