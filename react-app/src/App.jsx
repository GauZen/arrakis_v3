import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import React, { useState } from "react";
import AllBonds from "./components/bonds/AllBonds";
import { getAllParties } from './services/PartyServices';
import { getAllTrades } from "./services/TradeServices";
import { getAllSecurities } from "./services/SecurityService";
/* import { BrowserRouter, Routes, Route } from "react-router-dom"
import Auth from "./components/Auth" */


function App() {
  const [checked, setChecked] = useState(false);

  const handleChange = () => {
    setChecked(!checked);
  };

  const [parties, setParties] = useState([]);

  getAllParties().then(res => {
      setParties(res.data);
  }).catch(err => {
      setParties([]);
      console.log(err);
  })

  const [trades, setTrades] = useState([]);
  getAllTrades().then(res => {
    setTrades(res.data);
  }).catch(err =>{
    setTrades([]);
    console.log(err);
  })

  const [securities, setSecurities] = useState([]);
  getAllSecurities().then(res => {
    setSecurities(res.data);
  }).catch(err => {
    setSecurities([]);
    console.log(err);
  })

  return (
    <div className="app-container" key="app">
    
      {/* <BrowserRouter>
        <Routes>
          <Route path="/auth" element={<Auth />} />
        </Routes>
      </BrowserRouter> */}
      <label htmlFor="checkout">
        <input type="checkbox" name="checkbox" id="checkbox"
          checked={checked}
          onChange={handleChange}
        />
        Show Bonds by Maturity within the last and next 5 days
      </label>
      <AllBonds status={checked} trades={trades} parties={parties} securities={securities} key="app-allbonds" />
    </div>
  );
}

export default App;

