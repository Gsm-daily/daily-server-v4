package com.project.daily

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DailyApplication

fun main(args: Array<String>) {
	runApplication<DailyApplication>(*args)
}
