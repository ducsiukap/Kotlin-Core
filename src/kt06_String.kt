fun main() {
//    Creating a string
    var str = "Hello Kotlin!" // = String() or "" for empty String
    println(str)
//    String Element
    // using index:
    println("str[0] = ${str[0]}")
    // using str.get(idx)

//    Iterating over a String
    // for (i in str.indices)
    for (char in str) print("$char ")
    println()
    str.forEach { print("$it ") } // forEach()
    println()

//    String template // embedded variable into a string
    print("Enter your name: ")
    val name = readln()
    val hello = "Hello, $name. Have a good day!"
    println(hello) // or println("Hello, $name. Have a good day!")

    println("str.length is ${str.length}")

//     Take a sub string
    // using subSequence(start[, stop])
    // using substring(start[, stop])
    val sub = str.substring(0, 5)
    println(sub)

    println("str.compareTo(hello) = ${str.compareTo(hello)}") // return 0 if str == hello, else != 0
    println("str.equals(hello) = ${str.equals(hello)}") // -> true / false

//    Raw string : multiple line string without '\n'
    // using """content""".trimMargin()
    val rawStr = """My name is Duc.
        |Im 20 yo 
        |and im a student!
    """.trimMargin()
}