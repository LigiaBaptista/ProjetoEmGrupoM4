import {Badge, ListGroup, Container }from 'react-bootstrap';
import './Playlist.module.css';

function DefaultExample() {
  return (
    <Container className="text">
    <ListGroup className="bg-dark" as="ol" numbered>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-success bg-dark"
        >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Save Your Tears</div>
          The Weeknd
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Needed Me</div>
          Rihanna
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Bound 2</div>
          Kanye West
        </div>
        <Badge bg="none" pill>
         ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Father Stretch My Hands Pt.1</div>
          Kanye West
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Sidewalks</div>
          The Weeknd, Kendrick Lamar
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">You Da One</div>
          Rihanna
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Make It Better</div>
          Anderson Paak.
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Ta Vendo Aquela Lua</div>
          Thiaguinho
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">A Loba</div>
          Alcione
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Mande Um Sinal</div>
          Pixote
        </div>
        <Badge bg="none" pill>
         ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Pura Adrenalina</div>
          Belo
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item> 
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">É No Pagode</div>
          Exaltasamba
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start text-white bg-dark"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">Lancinho</div>
          Turma do Pagode
        </div>
        <Badge bg="none" pill>
          ...
        </Badge>
      </ListGroup.Item>
    </ListGroup>
  </Container>
  );
}

export default DefaultExample;
