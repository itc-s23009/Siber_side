package jp.ac.it_college.std.s23009.practice.chap2

class CommonCalculationExecutor(override val message: String = "calc") : CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("Not implements calc")
    }

    override fun printStartMessage() {
        println("start $message")
    }
}