import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter } from 'react-router-dom';

import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import 'bootstrap/dist/css/bootstrap.min.css';
// import App from './App'
import './index.css';
import Player from './components/Player/Player';
ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
    <Player />
  </React.StrictMode>,
);
