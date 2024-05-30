package jp.ac.it_college.std.s23009.practice.chap3

fun main() {
    val user = UserJava()
    user.id = 100
    user.name = "Takehata"
    println(user.id)
    println(user.name)

    val function = CalcJava{num1, num2 -> num1 + num2 }
    println(function)
}