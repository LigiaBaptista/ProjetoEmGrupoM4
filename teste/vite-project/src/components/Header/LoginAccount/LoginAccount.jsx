import { useState } from 'react';
import Profile from '../../../assets/img/profile.svg';
import React from 'react';

import {Button} from 'react-bootstrap'
function LoginAccount() {
	const [show, setShow] = useState(false);

	const handleClose = () => setShow(false);
	const handleShow = () => setShow(true);

	return (
    <>
      <Button variant="dark" onClick={handleShow}>
        <a href="/biblioteca" className="text-decoration-none text-white">
          <img
            alt=""
            src={Profile}
            width="30"
            height="30"
            className="d-inline-block align-center"
          />{' '}
          Luis
        </a>
      </Button>
    </>
  );
}

export default LoginAccount;
