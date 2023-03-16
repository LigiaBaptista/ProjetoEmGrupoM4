
import Header from "./components/Header/Header"
import CarouselPage from "./components/CarouselPage";
import Modal from "./components/ModalLogin";
import Footer from "./components/Footer";
import FilmesCarousel from "./components/FilmesCarousel";

function App() {
  return (
    <div className="App">
      <Header/>
      <br/>
      <CarouselPage/>
      <br/>
      <Modal/>
      <br/>
    <Footer/>
      <br/> 
      <h4 style={{color:"white"}}>Filmes</h4>
      <br/>
   <FilmesCarousel/>
    </div>
  );
}

export default App;

