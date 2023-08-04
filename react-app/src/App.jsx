import React, { useState } from "react";
import AllBonds from "./components/bonds/AllBonds";


function App() {
  const [showBondsByMaturity, setShowBondsByMaturity] = useState(false);

  const handelBondsByMaturity = (event) => {
    console.log(event);
    setShowBondsByMaturity(!showBondsByMaturity);
    console.log(showBondsByMaturity)
  }
  return (
    <div className="container" key="app">
      <button className='green-class' onClick={handelBondsByMaturity}>select</button>
      <AllBonds status={showBondsByMaturity} key="app-allbonds"/>
    </div>

  );
}

export default App;

