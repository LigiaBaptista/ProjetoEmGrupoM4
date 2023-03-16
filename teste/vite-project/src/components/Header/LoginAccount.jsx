import { useState } from "react";
import Profile from "../../assets/img/profile.svg";
import Modal from "../ModalLogin";
import React  from "react";
function LoginAccount(){
    const [show, setShow] = useState(false);

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    return(
    <> 
    <button onClick={() => handleShow()}>
    <a href="#login" style={{textDecoration:"none", fontFamily:"Inter"}} ><img
    alt=""
    src={Profile}
    width="30"
    height="30"
    className="d-inline-block align-center"
    /> Login
    </a></button>
    <Modal show={show} handleShow={handleShow} handleClose={handleClose}/>
    </>
    )
}

export default LoginAccount;



