package com.carminati.ratemycourseload.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

  private final CourseRepository courseRepository;

  @Autowired
  public CourseService(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  public List<Course> getCourses() {
    return courseRepository.findAll();
  }

  public void addNewCourse(Course course) {
    Optional<Course> courseOptional = courseRepository
            .findCourseByCourseNumber(course.getCourseNumber());
    System.out.println(courseOptional);
    if (courseOptional.isPresent()) {
      throw new IllegalStateException("Course already inputted");
    }
    courseRepository.save(course);
  }

  public void deleteCourse(Long courseId) {
    boolean exists = courseRepository.existsById(courseId);
    if (!exists) {
      throw new IllegalStateException("Course with id " + courseId + " does not exist");
    }
    courseRepository.deleteById(courseId);
  }
}
