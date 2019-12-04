package com.example.demo

import org.springframework.stereotype.Component
import java.util.*

@Component
class Calculadora {

    fun random(): Int {
        return Random().nextInt()
    }

}