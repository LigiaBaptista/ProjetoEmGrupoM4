import { useEffect, useState } from 'react';
import api from '../../services/api';

const GetFilmes = () => {
  const [filmes, setFilmes] = useState([]);

  useEffect(() => {
    api.get('/filmes').then((response) => {
      setFilmes(response.data);
    });
  }, []);

  return (
    <div>
      {filmes.map((filme) => (
        <div key={filme.id}>
          <img src={filme.poster_url} alt={filme.nome} />
          <h1>{filme.nome}</h1>
        </div>
      ))}
    </div>
  );
};

export default GetFilmes;
