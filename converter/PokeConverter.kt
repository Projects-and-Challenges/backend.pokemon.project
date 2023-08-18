package backend.pokemon.project.converter

import backend.pokemon.project.controller.dto.GetAllPokemonByUserIdResponse
import backend.pokemon.project.controller.dto.PokemonUserResponse
import backend.pokemon.project.domain.PokeUser
import backend.pokemon.project.domain.PokeUserImages

object PokeConverter {


    fun toGetAllPokemonByUserIdResponse(pokeUser: PokeUser, pokeImage: PokeUserImages): GetAllPokemonByUserIdResponse {
        return GetAllPokemonByUserIdResponse(
            id = pokeUser.id,
            user_id = pokeUser.userId,
            pokemons = listOf(
                PokemonUserResponse(
                    name = pokeUser.pokemon1,
                    image = pokeImage.pokemon1
                ),
                PokemonUserResponse(
                    name = pokeUser.pokemon2,
                    image = pokeImage.pokemon2
                ),
                PokemonUserResponse(
                    name = pokeUser.pokemon3,
                    image = pokeImage.pokemon3
                ),
                PokemonUserResponse(
                    name = pokeUser.pokemon4,
                    image = pokeImage.pokemon4
                ),
                PokemonUserResponse(
                    name = pokeUser.pokemon5,
                    image = pokeImage.pokemon5
                ),
                PokemonUserResponse(
                    name = pokeUser.pokemon6,
                    image = pokeImage.pokemon6
                )
            )
        )
    }
}