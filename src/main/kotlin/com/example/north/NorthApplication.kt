package com.example.north

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication(exclude = arrayOf( DataSourceAutoConfiguration::class ))
class NorthApplication()

fun main(args: Array<String>) {
    runApplication<NorthApplication>(*args)
}