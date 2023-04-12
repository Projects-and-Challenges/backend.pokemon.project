package backend.pokemon.project.converter

import backend.pokemon.project.dto.HelloDto
import backend.pokemon.project.model.HelloDomain

object HelloConverter {
    fun toDto(helloDomain: HelloDomain): HelloDto {
        return HelloDto(message = helloDomain.message)
    }
}