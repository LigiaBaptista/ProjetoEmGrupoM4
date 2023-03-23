import Filme from '../Filmes/Filme'
import { useEffect, useState } from 'react'
import api from '../../services/api'

function Filmes() {
  const [pokemons, setPokemons] = useState([])

  useEffect(() => {
    api.get('/filmes').then(response => {
      setPokemons(response.data)
    })
  }, [])

  return (
    <div className="App">
      {pokemons && pokemons.map(pokemon => (
        <>
          <Filme pokemon={pokemon} style={{color:"white"}}/>
          
        </>
      ))}
    </div>
  )
}

export default Filmes