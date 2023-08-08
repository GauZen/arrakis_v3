import "bootstrap/dist/css/bootstrap.min.css"
import React, { useState } from "react";
import "./App.css"
/* import AllBonds from "./components/bonds/AllBonds"; */
import { BrowserRouter, Routes, Route } from "react-router-dom"
import Auth from "./components/Auth"


function App() {
  const [checked, setChecked] = useState(false);

  const handleChange = () => {
    setChecked(!checked);
  };

  return (
    <div className="container" key="app">
      <BrowserRouter>
        <Routes>
          <Route path="/auth" element={<Auth />} />
        </Routes>
      </BrowserRouter>
{/*       <label htmlFor="checkout">
        <input type="checkbox" name="checkbox" id="checkbox"
          checked={checked}
          onChange={handleChange}
        />
        Show Bonds by Maturity within the last and next 5 days
      </label>
      <AllBonds status={checked} key="app-allbonds" /> */}
    </div>
  );
}

export default App;

