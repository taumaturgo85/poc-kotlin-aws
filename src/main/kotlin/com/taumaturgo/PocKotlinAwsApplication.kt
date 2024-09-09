package com.taumaturgo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocKotlinAwsApplication

fun main(args: Array<String>) {
	runApplication<PocKotlinAwsApplication>(*args)
}
