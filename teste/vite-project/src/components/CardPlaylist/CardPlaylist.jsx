import React from 'react';
import { Card, Row, Col, Container} from 'react-bootstrap';
import Foto1 from '../../assets/img/foto1.png'
import Foto2 from '../../assets/img/foto2.png'
import Foto3 from '../../assets/img/foto3.png'
import Foto4 from '../../assets/img/foto4.png'


function CardWithImageAndText() {
  return (
    <Container>
      <Card className="bg-transparent text-white" style={{ border: 'none', margin: 0 }}>
      <Card.Body>
        <Card.Title style={{ fontSize: '40px' }}>Sua biblioteca</Card.Title>
      </Card.Body>
    </Card>

    <Card className="bg-transparent text-white my-4 mx-5">
      <Row>
        <Col md={2}>
          <Card.Img src={Foto1}/>
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

     <Card className="bg-transparent text-white my-4 mx-5">
     <Row>
       <Col md={2}>
         <Card.Img src={Foto2}/>
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

    <Card className="bg-transparent text-white my-4 mx-5">
    <Row>
      <Col md={2}>
        <Card.Img src={Foto3}/>
      </Col>
      <Col className="p-0" md={8}>
        <Card.Body>
          <Card.Title>Animações Para Assistir Cantando</Card.Title>
          <Card.Text>
           15 Filmes
          </Card.Text>
        </Card.Body>
      </Col>
    </Row>
  </Card>

  <Card className="bg-transparent text-white my-4 mx-5">
    <Row>
      <Col md={2}>
        <Card.Img src={Foto4}/>
      </Col>
      <Col className="p-0" md={8}>
        <Card.Body>
          <Card.Title>Séries Para Rir Até Doer a Barriga</Card.Title>
          <Card.Text>
            7 séries
          </Card.Text>
        </Card.Body>
      </Col>
    </Row>
  </Card>
  </Container>
  );
}

export default CardWithImageAndText;