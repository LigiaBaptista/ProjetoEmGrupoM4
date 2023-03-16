import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import Modal from 'react-bootstrap/Modal';
import styles from './ModalLogin.module.css';

function ModalLogin(props) {

const {handleShow, handleClose, show} = props

  return (
    <>
      <Modal show={show} onHide={handleClose} className={styles.Modal}>
        <Modal.Header closeButton>
          <Modal.Title style={{fontFamily:"Inter"}}>Autenticação</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form>
            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label style={{fontFamily:"Roboto", color:"#D9D9D9"}}>Email</Form.Label>
              <Form.Control
                type="email"
                placeholder="name@example.com"
                autoFocus
                style={{backgroundColor:'#D9D9D9'}}
              />
            </Form.Group>
            <Form.Group
              className="mb-3"
              controlId="exampleForm.ControlInput1"
            >
              <Form.Label style={{color:"#D9D9D9", fontFamily:"Roboto"}}>Senha</Form.Label>
              <Form.Control type="email"
                placeholder="senha"
                autoFocus style={{backgroundColor:'#D9D9D9'}}/>
            </Form.Group>
          </Form>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="primary" onClick={handleClose} style={{backgroundColor:"#0FA958", fontFamily:"Inter", fontStyle:"bold"}}>
            Logar
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  );
}

// render(<ModalLogin />);
export default ModalLogin;