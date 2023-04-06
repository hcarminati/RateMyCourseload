import { useState, useEffect } from "react";
import { getAllCourses } from "./client";
import { Spin } from "antd";
import { LoadingOutlined } from "@ant-design/icons";
import "./App.css";
import MainHeaderComponent from "./MainHeader/MainHeaderComponent";
import { errorNotification } from "./Notification";
import SearchCardsComponent from "./SearchCard/SearchCardsComponent";
import SearchBarCourseComponent from "./Search/SearchBar/SearchBarCourseComponent.tsx";

function App() {
  const [fetching, setFetching] = useState(true);
  const [allCourses, setAllCourses] = useState([]);

  const fetchCourses = () => {
    getAllCourses()
      .then((res) => res.json())
      .then((data) => {
        console.log(data);
        // allCourses = ["Test", "Data"];
        // allCourses = new Array(3).fill(9);
        setAllCourses(data);
      })
      .catch((err) => {
        console.log(err.response);
        err.response.json().then((res) => {
          console.log(res);
          errorNotification(
            "There was an issue",
            `${res.message} [${res.status}] [${res.error}]`
          );
        });
      })
      .finally(() => setFetching(false));
  };

  useEffect(() => {
    console.log("component is mounted");
    fetchCourses();
  }, []);

  const antIcon = <LoadingOutlined style={{ fontSize: 24 }} spin />;

  const renderStudents = () => {
    // console.log(allCourses);
    if (fetching) {
      return <Spin indicator={antIcon} />;
    }
    // if (!allCourses) {
    //   return (
    //     <>
    //       <div>
    //         No courses to display.
    //       </div>
    //     </>
    //   );
    // }
    return <div> {SearchCardsComponent(allCourses)} </div>;
  };

  return (
    <body className="bodywhole">
      <MainHeaderComponent />
      {renderStudents()}
      <SearchBarCourseComponent searchTitle="Search for a course" />
      <div className="search_results">
        <div className="search_cards">{SearchCardsComponent(allCourses)}</div>
      </div>
    </body>
  );
}

export default App;
