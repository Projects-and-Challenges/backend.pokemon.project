package backend.pokemon.project.repository

import backend.pokemon.project.domain.PokeUser
import backend.pokemon.project.domain.PokeUserImages
import backend.pokemon.project.repository.mapper.PokeUserImagesMapper
import backend.pokemon.project.repository.mapper.PokeUserMapper
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class PokeRepository(
    private val namedParameterJdbcTemplate: NamedParameterJdbcTemplate
) {

    private val SELECT_POKES_BY_USER_ID = """
        SELECT * FROM user_pokemon
        WHERE user_master_id = :userId
    """.trimIndent()

    private val SELECT_POKES_IMAGES_BY_USER_ID = """
        SELECT * FROM user_pokemon_images
        WHERE user_master_id = :userId
    """.trimIndent()

    fun getAllPokeNameByUserId(userId: Long): PokeUser {
        return namedParameterJdbcTemplate.query(
            SELECT_POKES_BY_USER_ID,
            mapOf("userId" to userId),
            PokeUserMapper()
        ).first()
    }

    fun getAllPokeImageByUserId(userId: Long): PokeUserImages {
        return namedParameterJdbcTemplate.query(
            SELECT_POKES_IMAGES_BY_USER_ID,
            mapOf("userId" to userId),
            PokeUserImagesMapper()
        ).first()
    }



}