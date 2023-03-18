import React from "react";
import { Container } from "react-bootstrap";
import Capa from '../../assets/img/foto1.png';
import Shuffle from '../../assets/img/Player/shuffle.svg';
import Previous from '../../assets/img/Player/previous.svg';
import Play from '../../assets/img/Player/play-circle-fill.svg';
import Next from '../../assets/img/Player/next.svg';
import Repeat from '../../assets/img/Player/repeat.svg';

function Player() {
    const now = 60;
    return(
        <Container className="d-flex justify-content-center align-items-center flex-column">
            <div><img src={Capa} alt="capa" style={{width:"400px"}}/></div>
            <div> <h4 className="mt-3 mb-1">Save Your Tears</h4></div>
            <div><h5>The Weeknd</h5></div>
            <div className="d-flex justify-content-center align-items-center p-5">
                <div className="px-3" ><img src={Shuffle} alt="" style={{width:"40px"}} /></div>
                <div className="px-3"><img src={Previous} alt="" style={{width:"40px"}}  /></div>
                <div className="px-3"><img src={Play} alt="" style={{width:"40px"}}  /></div>
                <div className="px-3"><img src={Next} alt="" style={{width:"40px"}}  /></div>
                <div className="px-3"><img src={Repeat} alt="" style={{width:"40px"}} /></div>
            </div>

        </Container>
    )
}

export default Player;