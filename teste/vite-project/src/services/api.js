import axios from 'axios'

const apiPokemon = axios.create({
  baseURL: 'http://localhost:8080/api'
})

export default apiPokemon;