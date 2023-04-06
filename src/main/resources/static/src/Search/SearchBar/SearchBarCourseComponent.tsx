import "./style.css";
import * as React from "react";

const SearchBarCourseComponent = ({
  searchTitle,
  onChange,
}: {
  searchTitle: string,
  onChange: React.ChangeEventHandler,
}) => {
  return (
    <div className="search_container">
      <div className="search_components">
        <h1 className="search_header">{searchTitle}</h1>

        <label className={"search_label"}>
          <svg
            viewBox="0 0 24 24"
            width="24"
            height="24"
            stroke="currentColor"
            strokeWidth="2"
            fill="none"
            strokeLinecap="round"
            strokeLinejoin="round"
            className="css-i6dzq1"
          >
            <circle cx="11" cy="11" r="8"></circle>
            <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
          </svg>
          <input placeholder="Enter course name or number" type="search" />
        </label>
      </div>
    </div>
  );
};

export default SearchBarCourseComponent;
