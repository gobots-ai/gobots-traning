package com.example.demo

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class TestComponent (val calculadora: Calculadora,
                     val kkk: KKK) {


    fun soma(): Int {
        return 1 + calculadora.random()
    }

    @PostConstruct
    fun test() {
        println(soma())
        kkk.oi()
    }

}