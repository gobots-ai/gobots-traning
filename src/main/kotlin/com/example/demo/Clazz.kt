package com.example.demo


open class Clazz (
    val a: Int,
    var b: String
) {
    fun dsadsa(): Unit {
        b + a
    }
}

class Raaaa: Clazz(1, "") {

}

interface Ccaaaa {
    val f: Int

    fun dasda(): Int

    fun dasdsew(): Unit {

    }
}

abstract class EEEE {

}

class DDDDD(override val f: Int) : Ccaaaa {
    override fun dasda(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dasdsew() {
        super.dasdsew()
    }

}

fun main() {
    val c = Clazz(3, "2")
    val b = c == Clazz(3, "2")
    println(b)
}