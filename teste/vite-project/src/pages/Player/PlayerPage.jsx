import Header from "../../components/Header/Header";
import Footer from "../../components/Footer/Footer";
import Player from "../../components/Player/Player";
import { Container } from "react-bootstrap";
import Barra from '../../components/Player/Barra'

export default function PlayerPage(){
    return(
        <>
        <Header/>
        <Container>
        <Player/>
        <Barra/>
        </Container>
        <Footer/>
        </>
    )
}