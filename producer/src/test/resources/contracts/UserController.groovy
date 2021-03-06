import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url('/system/user') {
            queryParameters {
                parameter("name", "张三")
            }
        }

    }
    response {
        status 200
        body("""
    {
        "id":1,
        "name":"张三",
        "age":15,
        "sex":"男",
        "remark":"....."
    }
  """)
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}
