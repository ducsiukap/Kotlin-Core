import kotlin.reflect.typeOf

fun main() {
    /* key features of Variable
    - type of local variable can be inferred from the initialized value
    - declare with 'val' for immutable variable
    - declare with 'var' for mutable variable
    - syntax:   <var or val> variableName[:Type] = value
     */

    //Datatype
    var /* mutable */ i:Int = 20 // Integer: Byte, Short, Int, Long
    println("Integer: $i")
    val/* immutable */ l:Long = 999999999L // using suffix 'L' for Long
    print("Long: $l")

    val f = 3.14F // Floating point: Double, Float
                  // using suffix 'F' for Float
    println("Float: $f")
    val d:Double = 9.9999
    println("Double: $d")

    val b:Boolean = true // Boolean -> true / false
    println("Boolean: $b")

    val D = 'D'
    val u = 'u'
    val c = 'c'
    println("Char: $D $u $c")
}