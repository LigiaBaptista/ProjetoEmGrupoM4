import React, { useState } from 'react';
import {Container, Row, Form, Col, Button} from "react-bootstrap";
import axios from 'axios';
import styles from './formulario.module.css';
function Formulario() {
    const [validado, setValidado] = useState(false);
    const [endereco, setEndereco] = useState({});

    const Submit = (event) => {
        const form = event.currentTarget;
        if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
        } else {
            event.preventDefault();

            const cep = event.target.formCEP.value;
            axios.get(`https://viacep.com.br/ws/${cep}/json/`)
                .then(res => {
                    setEndereco(res.data);
                })
                .catch(err => {
                    console.log(err);
                })
        }
        setValidado(true);
    };

    return (
        <Container className={styles.Container}>
            <h2> Cadastro </h2>
            <Form noValidate validated={validado} onSubmit={Submit}>
                <Form.Group className="mb-3 text-white" controlId="formName">
                    <Form.Label>Nome</Form.Label>
                    <Form.Control type="name" placeholder="Digite seu nome" required />
                    <Form.Control.Feedback type="invalid">
                        Por favor, digite seu nome
                    </Form.Control.Feedback>
                </Form.Group>
                <Form.Group className="mb-3" controlId="formEmail">
                    <Form.Label>E-mail</Form.Label>
                    <Form.Control type="email" placeholder="Digite seu e-mail" required />
                    <Form.Control.Feedback type="invalid">
                        Por favor, digite seu E-mail
                    </Form.Control.Feedback>
                </Form.Group>
                <Row className="mb-3">
                    <Form.Group as={Col} controlId="formTelefone">
                        <Form.Label>Telefone</Form.Label>
                        <Form.Control type="tel" placeholder="Digite seu telefone" required />
                        <Form.Control.Feedback type="invalid">
                            Por favor, digite seu telefone
                        </Form.Control.Feedback>
                    </Form.Group>
                    <Form.Group as={Col} controlId="formCPF">
                        <Form.Label>CPF</Form.Label>
                        <Form.Control type="text" placeholder="Digite seu CPF" required />
                        <Form.Control.Feedback type="invalid">
                            Por favor, digite seu CPF
                        </Form.Control.Feedback>
                    </Form.Group>
                </Row>
                <Row className="mb-4">
                    <Form.Group as={Col} controlId="formEndereco">
                        <Form.Label>Endereço</Form.Label>
                        <Form.Control type="text" placeholder="" value={endereco.logradouro} required />
                    </Form.Group>
                    <Form.Group as={Col} controlId="formNum">
                        <Form.Label>Numero</Form.Label>
                        <Form.Control type="text" placeholder="Digite o numero do endereço" required />
                        <Form.Control.Feedback type="invalid">
                            Por favor, digite o numero do endereço
                        </Form.Control.Feedback>
                    </Form.Group>
                    <Form.Group as={Col} controlId="formComplemento">
                        <Form.Label>Complemento</Form.Label>
                        <Form.Control type="text" placeholder="Digite o complemento do endereço" />
                    </Form.Group>
                </Row>
                <Row className="mb-3">
                    <Form.Group as={Col} controlId="formCidade">
                        <Form.Label>Cidade</Form.Label>
                        <Form.Control type="text" placeholder="" value={endereco.localidade} required />
                    </Form.Group>
                    <Form.Group as={Col} controlId="formEstado">
                        <Form.Label>Estado</Form.Label>
                        <Form.Control type="Estado" placeholder="" value={endereco.uf} onChange={(event) => setEndereco({...endereco, uf: event.target.value})}/>
                    </Form.Group>
                    <Form.Group as={Col} controlId="formCEP">
                        <Form.Label>CEP</Form.Label>
                        <Form.Control type="CEP" placeholder="" required onChange={(event) => setEndereco({...endereco, cep: event.target.value})}/>
                        <Form.Control.Feedback type="invalid">
                            Por favor, digite seu CEP
                        </Form.Control.Feedback>
                    </Form.Group>
                </Row>
                <Row className="mb-3">
                    <Form.Group as={Col} controlId="formSenha">
                        <Form.Label>Senha</Form.Label>
                        <Form.Control type="password" placeholder="digite sua senha aqui" />
                        <Form.Control.Feedback type="invalid">
                            Por favor, digite sua senha
                        </Form.Control.Feedback>
                        <Form.Text id="SenhaBlock" muted>
                            Sua senha deve ter de 8 a 20 caracteres, conter letras e números
                        </Form.Text>
                    </Form.Group>
                    <Form.Group as={Col} controlId="formConfsenha">
                        <Form.Label>Confirmar Senha</Form.Label>
                        <Form.Control.Feedback type="invalid">
                            Por favor, confirme sua senha
                        </Form.Control.Feedback>
                        <Form.Control type="password" placeholder="Confirme sua senha" />
                    </Form.Group>
                </Row>
                <Button variant="success" type="submit">
                    CADASTRAR
                </Button>
            </Form>
        </Container>
    );
}

export default Formulario;

