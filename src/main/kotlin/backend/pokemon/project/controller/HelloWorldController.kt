package backend.pokemon.project.controller

import backend.pokemon.project.converter.HelloConverter
import backend.pokemon.project.dto.HelloDto
import backend.pokemon.project.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController(
        private val helloService: HelloService
) {

    @GetMapping
    fun helloWorld(): HelloDto {
//        return HelloConverter.toDto(helloService.helloWorld())
        return helloService.helloWorld().let{
            HelloConverter.toDto(it)
        }
    }
}