package backend.pokemon.project.service

import backend.pokemon.project.model.HelloDomain
import backend.pokemon.project.repository.HelloRepository
import org.springframework.stereotype.Service

@Service
class HelloService(
        private val helloRepository: HelloRepository
) {
    fun helloWorld(): HelloDomain {
        return helloRepository.helloWorld()
    }
}