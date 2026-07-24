import React from "react";

function BookDetails() {

    const books = [
        {
            id: 1,
            title: "React in Action",
            author: "Mark Tielens Thomas"
        },
        {
            id: 2,
            title: "Learning JavaScript",
            author: "Ethan Brown"
        }
    ];

    return (

        <div>

            <h2>Book Details</h2>

            {
                books.map(book => (

                    <div key={book.id}>

                        <h3>{book.title}</h3>

                        <p>Author : {book.author}</p>

                        <hr />

                    </div>

                ))
            }

        </div>

    );
}

export default BookDetails;