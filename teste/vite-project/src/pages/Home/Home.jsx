import React from 'react';
import styles from './Home.module.css'
import Carousel from '../../components/CarrosselPage/CarrosselPage';
import Filmes from '../../components/CarrosselPage/FilmesCarousel';
import Series from '../../components/CarrosselPage/SeriesCarousel';
import Musicas from '../../components/CarrosselPage/MusicasCarousel';


export default function Home(){
  return(
    <container className="d-flex flex-column justify-content-center">
      <Carousel />
        <Filmes/>
      {/* <br/>
      <h4>Séries</h4>
      <br/>
      <Series/>
      <br/>
      <h4>Músicas</h4>
      <br/>
      <Musicas/> */}
    </container>
  )
}