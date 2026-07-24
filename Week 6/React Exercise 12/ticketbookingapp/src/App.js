import './App.css';
import { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function App() {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    return (

        <div className="App">

            <h1>Ticket Booking App</h1>

            {
                isLoggedIn ?

                    <>
                        <button onClick={() => setIsLoggedIn(false)}>
                            Logout
                        </button>

                        <UserPage />
                    </>

                    :

                    <>
                        <button onClick={() => setIsLoggedIn(true)}>
                            Login
                        </button>

                        <GuestPage />
                    </>

            }

        </div>

    );
}

export default App;