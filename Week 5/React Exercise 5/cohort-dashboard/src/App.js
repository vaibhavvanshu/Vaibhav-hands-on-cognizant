import './App.css';
import CohortDetails from './components/CohortDetails';

function App() {

  const cohorts = [

    {
      name: "INTADMDF10 .NET FSD",
      technology: ".NET Full Stack",
      trainer: "John David",
      status: "ongoing",
      startDate: "10-Jul-2026",
      coach: "Rahul"
    },

    {
      name: "ADM21JF014 Java FSD",
      technology: "Java Full Stack",
      trainer: "Priya Sharma",
      status: "completed",
      startDate: "01-Apr-2026",
      coach: "Amit"
    },

    {
      name: "PYTH18A Python",
      technology: "Python",
      trainer: "Neha Kapoor",
      status: "ongoing",
      startDate: "15-Jun-2026",
      coach: "Rakesh"
    }

  ];

  return (

    <div>

      <h1>Cognizant Academy Dashboard</h1>

      {
        cohorts.map((cohort, index) => (

          <CohortDetails
            key={index}
            cohort={cohort}
          />

        ))
      }

    </div>

  );
}

export default App;