fun main(args: Array<String>) {

    println("Digite o primeiro número: ")
    val x: Int = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val y: Int = readLine()!!.toInt()

    val resultado: Int = x * y

    println("O resultado da multiplicação é $resultado")
}