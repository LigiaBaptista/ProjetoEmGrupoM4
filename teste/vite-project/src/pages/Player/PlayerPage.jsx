import Header from "../../components/Header/Header";
import Footer from "../../components/Footer/Footer";
import Player from "../../components/Player/Player";
import { Container } from "react-bootstrap";
import App from '../../components/ProgressBar/App.jsx'

export default function PlayerPage(){
    return(
        <>
        <Header/>
        <Container>
        <Player/>
        <App/>
        </Container>
        <Footer/>
        </>
    )
}