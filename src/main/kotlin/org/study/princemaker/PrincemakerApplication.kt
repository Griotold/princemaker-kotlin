package org.study.princemaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrincemakerApplication

fun main(args: Array<String>) {
	runApplication<PrincemakerApplication>(*args)
}
