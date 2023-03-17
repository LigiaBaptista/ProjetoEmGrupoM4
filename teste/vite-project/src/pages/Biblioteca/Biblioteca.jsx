import React from 'react';
import { Card, Row, Col, Container } from 'react-bootstrap';
import Gatiinho from '../../assets/img/gatiinho.png'
import Gatinho2 from '../../assets/img/gatinho2.png'
import Gatinho3 from '../../assets/img/gatinho3.png'

function CardWithImageAndText() {
  return (
    <Container>
    <Card className="bg-transparent text-white my-4">
      <Row>
        <Col md={2}>
          <Card.Img src={Gatiinho}/>
        </Col>
        <Col className="p-0" md={8}>
          <Card.Body>
            <Card.Title>Músicas Duvidosas</Card.Title>
            <Card.Text>
              900 músicas
            </Card.Text>
          </Card.Body>
        </Col>
      </Row>
    </Card>

     <Card className="bg-transparent text-white my-4">
     <Row>
       <Col md={2}>
         <Card.Img src={Gatinho2}/>
       </Col>
       <Col className="p-0" md={8}>
         <Card.Body>
           <Card.Title>Filmes Para Chorar Igual Criança</Card.Title>
           <Card.Text>
             6 filmes
           </Card.Text>
         </Card.Body>
       </Col>
     </Row>
   </Card>

    <Card className="bg-transparent text-white my-4">
    <Row>
      <Col md={2}>
        <Card.Img src={Gatinho3}/>
      </Col>
      <Col className="p-0" md={8}>
        <Card.Body>
          <Card.Title>Séries Para Rir Até Doer A Barriga</Card.Title>
          <Card.Text>
            3 séries
          </Card.Text>
        </Card.Body>
      </Col>
    </Row>
  </Card>

  <Card className="bg-transparent text-white my-4">
    <Row>
      <Col md={2}>
        <Card.Img src={Gatiinho}/>
      </Col>
      <Col className="p-0" md={8}>
        <Card.Body>
          <Card.Title>Músicas Duvidosas</Card.Title>
          <Card.Text>
            900 músicas
          </Card.Text>
        </Card.Body>
      </Col>
    </Row>
  </Card>
  </Container>
  );
}

export default CardWithImageAndText;