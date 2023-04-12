package backend.pokemon.project.repository

import backend.pokemon.project.model.HelloDomain
import org.springframework.stereotype.Repository

@Repository
class HelloRepository {
    fun helloWorld(): HelloDomain {
        return HelloDomain(message = "Hello World")
    }
}