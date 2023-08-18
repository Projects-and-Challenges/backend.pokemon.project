package backend.pokemon.project.repository.mapper

import backend.pokemon.project.domain.PokeUser
import java.sql.ResultSet
import org.springframework.jdbc.core.RowMapper

class PokeUserMapper: RowMapper<PokeUser> {
    override fun mapRow(rs: ResultSet, rowNum: Int): PokeUser? {
        return PokeUser(
            id = rs.getLong("id"),
            userId = rs.getLong("user_master_id"),
            pokemon1 = rs.getString("pokemon1"),
            pokemon2 = rs.getString("pokemon2"),
            pokemon3 = rs.getString("pokemon3"),
            pokemon4 = rs.getString("pokemon4"),
            pokemon5 = rs.getString("pokemon5"),
            pokemon6 = rs.getString("pokemon6")
        )
    }

}