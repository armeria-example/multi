package multi.module

import io.grpc.ManagedChannelBuilder
import multi.module.idl.v1.user.RegisterUserRequest
import multi.module.idl.v1.user.RegisterUserResponse
import multi.module.idl.v1.user.UserServiceGrpcKt
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class WebfluxUserController {

    @PostMapping
    suspend fun registerUser(): RegisterUserResponse {
        val channel = ManagedChannelBuilder.forAddress("localhost", 8081)
            .usePlaintext()
            .build()

        val userStub = UserServiceGrpcKt.UserServiceCoroutineStub(channel)

        val request = RegisterUserRequest
            .newBuilder()
            .setLoginId("test1")
            .setPassword("test11")
            .build()

        val response = userStub.registerUser(request)

        return response
    }
}