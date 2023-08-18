package backend.pokemon.project.controller.dto

data class GetAllPokemonByUserIdResponse(
    val id: Long,
    val user_id: Long,
    val pokemons: List<PokemonUserResponse>? = emptyList()
)
