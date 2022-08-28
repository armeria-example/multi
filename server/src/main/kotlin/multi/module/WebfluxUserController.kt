package multi.module

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class WebfluxUserController {

    companion object {
        val log = LoggerFactory.getLogger(WebfluxUserController::class.java)!!
    }

    @GetMapping
    suspend fun retrieveUser(): String {
        log.info("http api test")
        return "test"
    }
}