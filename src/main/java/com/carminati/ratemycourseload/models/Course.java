package com.carminati.ratemycourseload.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
  @Id
  @SequenceGenerator(
          name = "course_sequence",
          sequenceName = "course_sequence",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "course_sequence"
  )
  private Long id;

  // TODO: map subject to shortened letters
  @Column(nullable = false)
  private String subject;
  @Column(nullable = false)
  private String courseNumber;
  @Column(nullable = false)
  private String attributes;
  @Column(nullable = false)
  private String college;
  @Column(nullable = false)

  // TODO: make semester class
  private String semesterName;
  @Column(nullable = false)
  private String semesterYear;
  @Column(nullable = false)

  // TODO: make prof class
  private String profFirstName;
  @Column(nullable = false)
  private String profLastName;
  @Column(nullable = false)

  // TODO: make difficulty class/enum?
  private Integer difficulty;

  public Course(String subject, String courseNumber, String attributes, String college, String semesterName, String semesterYear, String profFirstName, String profLastName, Integer difficulty) {
    this.subject = subject;
    this.courseNumber = courseNumber;
    this.attributes = attributes;
    this.college = college;
    this.semesterName = semesterName;
    this.semesterYear = semesterYear;
    this.profFirstName = profFirstName;
    this.profLastName = profLastName;
    this.difficulty = difficulty;
  }
}
