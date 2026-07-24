import './App.css';

import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    return (

        <div className="App">

            <h1>Blogger App</h1>

            {/* Ternary Operator */}

            {showBooks ? <BookDetails /> : null}

            {/* Logical AND */}

            {showBlogs && <BlogDetails />}

            {/* Element Variable */}

            {
                (() => {

                    let component = null;

                    if (showCourses) {
                        component = <CourseDetails />;
                    }

                    return component;

                })()
            }

        </div>

    );
}

export default App;