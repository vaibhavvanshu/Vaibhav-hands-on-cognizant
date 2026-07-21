import './App.css';
import officeImage from './office.jpg';

function App() {

  const offices = [

    {
      name: "Tech Park Office",
      rent: 55000,
      address: "Electronic City, Bangalore"
    },

    {
      name: "Business Hub",
      rent: 75000,
      address: "Whitefield, Bangalore"
    },

    {
      name: "Corporate Plaza",
      rent: 62000,
      address: "MG Road, Bangalore"
    }

  ];

  return (

    <div className="App">

      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="500"
      />

      <h2>Available Office Spaces</h2>

      {
        offices.map((office, index) => (

          <div
            key={index}
            className="card"
          >

            <h3>{office.name}</h3>

            <p
              style={{
                color:
                  office.rent < 60000
                    ? "red"
                    : "green"
              }}
            >
              Rent: ₹{office.rent}
            </p>

            <p>
              Address: {office.address}
            </p>

            <hr />

          </div>

        ))
      }

    </div>

  );
}

export default App;