import kotlin.random.Random

fun main(args: Array<String>) {
    println("Algo aprendí")

    //Ejercicio2
    println(Ejercicio1(10){ Random.nextInt(50,250)}.tablaSiete.contentToString())
}