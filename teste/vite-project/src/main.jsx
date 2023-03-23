import React from 'react';
import ReactDOM from 'react-dom/client';


import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import 'bootstrap/dist/css/bootstrap.min.css';
import App from './App'
import Filmes from './pages/Filmes/Filme'


import './index.css';



ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
    <Filmes />
  </React.StrictMode>,
);
