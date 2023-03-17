import React from 'react'
import ReactDOM from 'react-dom/client'

import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import 'bootstrap/dist/css/bootstrap.min.css';
// import App from './App'
import './index.css'
import Home from './pages/Home/Home'
ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <Home />
  </React.StrictMode>,
)
