package com.carminati.ratemycourseload.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Responsible for data accesses
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

  @Query("SELECT c FROM Course c WHERE c.courseNumber = ?1")
  Optional<Course> findCourseByCourseNumber(String courseNumber);
}
