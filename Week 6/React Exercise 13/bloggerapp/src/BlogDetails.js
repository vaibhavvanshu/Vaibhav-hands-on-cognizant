import React from "react";

function BlogDetails() {

    const blogs = [
        {
            id: 1,
            title: "React Hooks",
            author: "Vaibhav"
        },
        {
            id: 2,
            title: "Java Collections",
            author: "John"
        }
    ];

    return (

        <div>

            <h2>Blog Details</h2>

            {
                blogs.map(blog => (

                    <div key={blog.id}>

                        <h3>{blog.title}</h3>

                        <p>Author : {blog.author}</p>

                        <hr />

                    </div>

                ))
            }

        </div>

    );
}

export default BlogDetails;