import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import { Container } from 'react-bootstrap';
import logo from '../../assets/img/logo.png';

function Login() {
  return (
    <>
      <img src={logo} width="250px" alt="" />
      <Form className=" bg-dark p-3 rounded m-4 shadow text-light form">
        <Form.Group className="mb-3" controlId="formBasicEmail">
          <Form.Label>Email address</Form.Label>
          <Form.Control type="email" placeholder="Enter email" />
        </Form.Group>
        <Form.Group className="mb-3" controlId="formBasicPassword">
          <Form.Label>Password</Form.Label>
          <Form.Control type="password" placeholder="Password" />
        </Form.Group>
        <Button variant="success" className="float-end" type="submit">
          Logar
        </Button>
      </Form>
    </>
  );
}

export default Login;
