import { useEffect, useState } from 'react';
import api from '../../services/api';

const Filmes = () => {
  const [filmes, setFilmes] = useState([]);
  useEffect(() => {
    api.get('/filmes').then((response) => {
      console.log(response.data);
      setFilmes(response.data);
    });
  }, []);
  return (
    <div className='container'>
      {filmes.map((filme) => (
        <div key={filme.id}>
          <img src={filme.poster_url} alt={filme.nome} />
          <h1>
            [{filme.ano}] {filme.titulo}
          </h1>
          <p className="text-white">Generos: {filme.genero}</p>
          <p className="text-white">Elenco: {filme.elenco.join(', ')}</p>
          <p className="text-white">Diretor: {filme.diretor}</p>
          <p className="text-white">Duracao: {filme.duracao}min</p>

            
         
        </div>
      ))}
    </div>
  );
};

export default Filmes;
