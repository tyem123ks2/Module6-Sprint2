import logo from './logo.svg';
import './App.css';
import React from "react";
import {Routes, Route, BrowserRouter} from "react-router-dom";
import ProductListUser from "./components/ProductListUser";

function App() {
  return (
      <Routes>
        <Route path="" element={ProductListUser}/>
      </Routes>
  );
}

export default App;
