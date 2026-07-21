import React, { useState } from "react";

function CurrencyConvertor() {

    const [rupees, setRupees] = useState("");
    const [euros, setEuros] = useState("");

    const handleSubmit = () => {

        const result = (parseFloat(rupees) / 90).toFixed(2);

        setEuros(result);
    };

    return (

        <div>

            <h2>Currency Convertor</h2>

            <input
                type="number"
                placeholder="Enter Rupees"
                value={rupees}
                onChange={(e) => setRupees(e.target.value)}
            />

            <br /><br />

            <button onClick={handleSubmit}>
                Convert
            </button>

            <h3>Euro: € {euros}</h3>

        </div>

    );
}

export default CurrencyConvertor;