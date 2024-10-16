import java.util.Scanner;
fun main(args: Array<String>) {
    // output standard
    var mess = "Hello World!"
    print(mess) // no "\n" at end
    println(mess) // print(mess + "\n")
    // embedded variable: using '$'
    println("mess: $mess") // print("mess: " + mess + "\n")

    // input standard
    // using readln() -> read a line
    print("Input a mess: ")
    mess = readln()
    println("mess: $mess")
    try {
        print("Input a Int: ")
        val int = readln().toInt() // toType()
        println("Int: $int")
    } catch (e: Exception) { println("NumberFormatException()") }
    // using Scanner class
    val sc = Scanner(System.`in`)
    print("Input a mess: ")
    mess = sc.nextLine() // nextType()
    println("mess: $mess")
}