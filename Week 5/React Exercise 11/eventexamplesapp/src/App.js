import './App.css';
import { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {

  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! Have a nice day.");
  };

  const increase = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  return (

    <div className="App">

      <h1>React Event Examples</h1>

      <h2>Counter : {count}</h2>

      <button onClick={increase}>
        Increment
      </button>

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={onPress}>
        OnPress
      </button>

      <hr />

      <CurrencyConvertor />

    </div>

  );
}

export default App;