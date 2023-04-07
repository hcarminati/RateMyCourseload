package com.carminati.ratemycourseload.models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CourseController {

  private final CourseService courseService;

  @Autowired
  public CourseController(CourseService courseService) {
    this.courseService = courseService;
  }

  @GetMapping("/api/v1/courses")
  public List<Course> getCourses() {
    return courseService.getCourses();
  }

  @PostMapping("/api/v1/course")
  public void registerNewCourse(@RequestBody Course course) {
    courseService.addNewCourse(course);
  }

  @DeleteMapping(path = "{courseId}")
  public void deleteCourse(@PathVariable("courseId") Long courseId) {
    courseService.deleteCourse(courseId);
  }
}

