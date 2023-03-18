import { Button, Form, Container } from 'react-bootstrap';
import logo from '../../assets/img/logo.png';

function Login() {
  return (
    <Container className="d-flex flex-column justify-content-center align-items-center bg-success" style={{maxWidth: 400}}>
      <img src={logo} width={350} alt="logo" />
      <Form className="w-100">
        <Form.Group className="" controlId="exampleForm.ControlInput1">
          <Form.Label>Email address</Form.Label>
          <Form.Control type="email" placeholder="Insira seu email" autoFocus />
        </Form.Group>
        <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
          <Form.Label>Senha</Form.Label>
          <Form.Control type="password" placeholder="Insira sua senha" />
        </Form.Group>
        <Button variant="success" type="submit" className="w-100">
          Entrar
        </Button>
      </Form>
    </Container>
  );
}

export default Login;
