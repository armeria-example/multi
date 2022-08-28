# introduce

armeria-multi-module-repositories


# generate proto
```
./gradlew generateProto
```



# test 

###  basic webflux server test
```
curl -XGET http://127.0.0.1:8081/api/v1/user
```

### grpc(armeria) webflux test
```
curl -XPOST -H 'content-type: application/json; charset=utf-8; protocol=gRPC' 'http://127.0.0.1:8081/multi.module.idl.v1.user.UserService/RegisterUser' -d '{
  "loginId": "test",
  "password": "test1"
}'
```

### client test
```
curl -XPOST -H 'content-type: application/json; charset=utf-8' http://127.0.0.1:8080/api/v1/user
```