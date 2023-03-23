
function Filmes(props) {
 const {pokemon} = props

  return (
    <div key={pokemon.id}>
      <h1>{pokemon.titulo}</h1>
    </div>
  )
}
export default Filmes