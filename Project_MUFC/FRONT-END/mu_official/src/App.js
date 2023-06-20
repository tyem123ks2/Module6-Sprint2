import './App.css';
import React from "react";
import {Routes, Route} from "react-router-dom";
import ProductListUser from "./components/ProductListUser";

function App() {
  return (
      <Routes>
              <Route path="" element={<ProductListUser/>}/>
      </Routes>
  );
}

export default App;
