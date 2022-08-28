package multi.module


import multi.module.idl.v1.user.RegisterUserRequest
import multi.module.idl.v1.user.RegisterUserResponse
import multi.module.idl.v1.user.UserServiceGrpcKt
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class GrpcUserService : UserServiceGrpcKt.UserServiceCoroutineImplBase() {

    companion object {
        val log = LoggerFactory.getLogger(GrpcUserService::class.java)!!
    }

    override suspend fun registerUser(request: RegisterUserRequest): RegisterUserResponse {
        log.info(request.loginId)

        return RegisterUserResponse
            .newBuilder()
            .setLoginId(request.loginId)
            .build()
    }
}