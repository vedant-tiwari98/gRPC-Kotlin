package com.kotlingrpc.demoGrpc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoGrpcApplication

fun main(args: Array<String>) {
	runApplication<DemoGrpcApplication>(*args)
}
