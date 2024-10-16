fun main(args:Array<String>) {
    var a = 3
    val b = 5

    println("---Arithmetic Operators---")
    /*:
    a + b or a.plus(b)
    a - b or a.minus(b)
    a * b or a.times(b)
    a / b or a.div(b)
    a % b or a.rem(b)
    */
    println("$a + $b = ${a.plus(b)}\n" +
            "$a - $b = ${a - b}\n" +
            "$a * $b = ${a.times(b)}\n" +
            "$a / $b = ${a / b}\n" +
            "$a % $b = ${a.rem(b)}\n")

    println("--Relation Operators---")  // >, >=, <, <=, ==, !=, ===
    println("$a > $b = ${a > b}\n" + // or a.compareTo(b) > 0
            "$a <= $b = ${a.compareTo(b) <= 0}") // a <= b
    // a == b: check if a and b has same value
    // a === b: check if a and b point to same object
    a = 5 // change 'var' variable
    val c = a
    println("a, b, c = $a, $b, $c\n" +
            "a == b: ${a == b}\n" + // safety check: a?.equals(b)?: (b===null)
            "a === b: ${a === b}\n" +
            "a === c: ${a === c}\n")

    println("---Assigment operators---")
    a += b // a.plusAssign(b)
    println("a += b, a = $a\n")
    // -=, *=, /=, %=
    // or minusAssign(), timesAssign(), divAssign(), remAssign()

    println("---Unary Operators---")
    println("++a = ${++a}\n" + // or  a++ // a.inc() -> return a + 1, do not change a
            "--a = ${--a}\n") // or a-- // a.dec() return a - 1, do not change a
    println("---Logical Operators---")
    println("(a > b) && (a > c) : ${(a > b) && (a > c)}\n")
    // && for and, || for or, ! for not

    println("---Bitwise Operators---")
    println("$a.shl($b) = ${a shl b}\n" + // 1010 shl 5 = 0001 0100 0000 = 320
            "$a and $b = ${a.and(b)}") // 1010 and 0101 = 0000 = 0
    /*
    - a shl b, a shr b, a ushr b, a and b, a or b, a xor b, a inv b
    - or a.shl(b), a.shr(b), a.ushr(b), a.and(b), a.or(b), a.xor(b), a.inv(b)
     */
}