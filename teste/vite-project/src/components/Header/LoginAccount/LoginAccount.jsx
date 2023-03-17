import { useState } from 'react';
import Profile from '../../../assets/img/profile.svg';
import Modal from '../../ModalLogin/ModalLogin'
import React from 'react';

import {Button} from 'react-bootstrap'
function LoginAccount() {
	const [show, setShow] = useState(false);

	const handleClose = () => setShow(false);
	const handleShow = () => setShow(true);

	return (
    <>
      <Button variant="dark" onClick={handleShow}>
        <a href="#login" className="text-decoration-none text-white">
          <img
            alt=""
            src={Profile}
            width="30"
            height="30"
            className="d-inline-block align-center"
          />{' '}
          Login
        </a>
      </Button>
      <Modal show={show} handleShow={handleShow} handleClose={handleClose} />
    </>
  );
}

export default LoginAccount;
