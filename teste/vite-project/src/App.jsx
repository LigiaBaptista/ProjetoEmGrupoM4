import React, { Suspense, lazy } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';



import Header from "./components/Header/Header";
import Footer from "./components/Footer/Footer";

const Home = lazy(() => import('./pages/Home/Home'));
const Login = lazy(() => import('./pages/Login/Login'));
const Cadastro = lazy(() => import('./pages/Cadastro/Cadastro'));

function App() {
  return (

    <Router>
      <Suspense fallback={<div>Loading...</div>}>
        
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/login" element={<Login />} />
            <Route path="/cadastro" element={<Cadastro />} />
          <Route path="*" element={<h1>404: Not Found</h1>} />
        </Routes>
        
      </Suspense>
    </Router>

    // <div className="App">
    //   <Header />
    //   <br />
    //   <CarrosselPage />
    //   <br />

    //   <br />
    //   <Footer />
    // </div>
  );
}

export default App;

