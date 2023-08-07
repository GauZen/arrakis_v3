import React, { useState } from "react";
import AllBonds from "./components/bonds/AllBonds";


function App() {
  const [checked, setChecked] = useState(false);

  const handleChange =() => {
    setChecked(!checked);
  };

  return (
    <div className="container" key="app">
      <label htmlFor="checkout">
        <input type="checkbox" name="checkbox" id="checkbox" 
        checked= {checked}
        onChange={handleChange}
        />
        Show Bonds by Maturity within the last and next 5 days
      </label>
      <AllBonds status={checked} key="app-allbonds" />
    </div>
  );
}

export default App;

