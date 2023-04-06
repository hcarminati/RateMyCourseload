import CourseCardComponent from "./CourseCardComponent";

const SearchCardsComponent = ({ allCourses }) => {
  return (
    <div className="search-cards">
      {allCourses?.map((course) => (
        <CourseCardComponent key={course.id} course={course} />
      ))}
    </div>
  );
};

export default SearchCardsComponent;
