package backend.pokemon.project.domain

data class PokeUserImages(
    val id: Long,
    val userId: Long,
    val pokemon1: String?,
    val pokemon2: String?,
    val pokemon3: String?,
    val pokemon4: String?,
    val pokemon5: String?,
    val pokemon6: String?
)