import React from "react";
import "./style.css"; // Import the CSS file

const CourseCardComponent = ({ leftTitle, rightTitle, courses }) => {
  return (
    <div className="card">
      <div className="card-header">
        <h3 className="card-title left">{leftTitle}</h3>
        <h3 className="card-title right">{rightTitle}</h3>
      </div>

      <div className="card-body">
        <div className="course-number-info">
          {courses.map((course) => (
            <div key={course.id} className="course">
              <h4 className="course-number">{course.number}</h4>
            </div>
          ))}
        </div>

        <div className="course-title-info">
          {courses.map((course) => (
            <div key={course.id} className="course">
              <div className="course-title-info">
                <h4 className="course-title">{course.title}</h4>
              </div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default CourseCardComponent;
