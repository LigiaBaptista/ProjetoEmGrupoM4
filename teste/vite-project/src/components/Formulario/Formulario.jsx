import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
function Formulario() {

        const [validado, setValidado] = useState(false);
        const Submit = (event) => {
            const form = event.currentTarget;
            if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
            }

            setValidado(true);
        };

    return (
        <>
            <Form noValido validado={validado} onSubmit={Submit}>
                <Form.Group className="mb-3" controlId="formName">
                    <Form.Label>Nome</Form.Label>
                    <Form.Control type="email" placeholder="Digite seu nome" />
                    <Form.Control.Feedback type="invalid">
                        Por favor, digite seu nome
                    </Form.Control.Feedback>
                </Form.Group>
                <Form.Group className="mb-3" controlId="formEmail">
                    <Form.Label>E-mail</Form.Label>
                    <Form.Control type="email" placeholder="Digite seu e-mail" />
                    <Form.Control.Feedback type="invalid">
                        Por favor, digite seu E-mail
                    </Form.Control.Feedback>
                </Form.Group>
                <Row className="mb-3">
                <Form.Group as={Col} controlId="formTelefone">
                    <Form.Label>Telefone</Form.Label>
                    <Form.Control type="telefone" placeholder="Digite seu telefone" />
                    <Form.Control.Feedback type="invalid">
                        Por favor, digite seu telefone
                    </Form.Control.Feedback>
                </Form.Group>
                <Form.Group as={Col} controlId="formCPF">
                    <Form.Label>CPF</Form.Label>
                    <Form.Control type="CPF" placeholder="Digite seu CPF" />
                    <Form.Control.Feedback type="invalid">
                        Por favor, digite seu CPF
                    </Form.Control.Feedback>
                </Form.Group>
                </Row>
                <Form.Group controlId="formEndereco">
                    <Form.Label>Endereço</Form.Label>
                    <Form.Control type="endereço" placeholder="Digite seu endereço" />
                </Form.Group>
                <Row className="mb-3">
                <Form.Group as={Col} controlId="formComplemento">
                    <Form.Label>Complemento</Form.Label>
                    <Form.Control type="complemento" placeholder="Digite seu complemento" />
                </Form.Group>
                <Form.Group as={Col} controlId="formCEP">
                    <Form.Label>CEP</Form.Label>
                    <Form.Control type="CEP" placeholder="" />
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
                        Por favor, digite sua senha
                    </Form.Control.Feedback>
                    <Form.Control type="password" placeholder="Confirme sua senha" />
                </Form.Group>
                </Row>
                <Button variant="primary" type="submit">
                    CADASTRAR
                </Button>
            </Form>
        </>
    )
}

export default Formulario;