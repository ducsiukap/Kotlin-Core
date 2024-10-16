import kotlin.random.Random

fun main() {
    // if-else expression
    val months = arrayOf("January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December")
    try {
        print("Enter number of a month: ")
        val month = readln().toInt()
        if (month < 1 || month > 12) throw Exception("Invalid month")

        val days =  if (month == 1 || month == 3 || month == 5 || month == 7
            || month == 8 || month == 10 || month == 12) 31
        else if (month == 2) 29
        else 30
        println("${months[month-1]} has $days days!")
    } catch (e: Exception) { println(e) }
    // Ternary Operator
    val a = Random.nextInt(5, 10)
    val b = Random.nextInt(5, 10)
    println("max($a, $b) is ${if (a > b) a else b}")
    print("Press any key to continue ")
    readln()
    print("\u001b[H\u001b[2J") // clear console


    // when -> smth like switch-case
    try {
        print("Enter number of a month: ")
        val month = readln().toInt()
        if (month < 1 || month > 12) throw Exception("Invalid month")

        val days = when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            2 -> 29
            else -> 30
        }
        println("${months[month-1]} has $days days!")
    } catch (e: Exception) { println(e) }
    print("Press any key to continue ")
    readln()
    print("\u001b[H\u001b[2J") // clear console


    // LOOPs
    // while loop
    println()
    var c = Random.nextInt(1, a)
    println("c = $c, a = $a, loop until c is not less than a with while loop:")
    while (c < a) {
        println("c = $c, a = $a, c < a : ${(c < a)} => continue loop")
        ++c
    }
    println("c = $c, a = $a, c < a : ${(c < a)} => end loop")
    print("Press any key to continue ")
    readln()
    print("\u001b[H\u001b[2J") // clear console
    // do-while loop
    println()
    var d = Random.nextInt(a - 1)
    println("d = $d, a = $a, loop until d is not less than a with do-while loop:")
    do {
        println("d = $d, a = $a, d < a : ${(d < a)} => continue loop")
        ++d
    } while (d < a)
    println("d = $c, a = $a, d < a : ${(d < a)} => continue loop")
    print("Press any key to continue ")
    readln()
    print("\u001b[H\u001b[2J") // clear console
    // for in range loop // for (i in start..stop [step n])
    println()
    // or for (i in start downTo stop [step n]) if start > stop
    print("count odd number in 1..10 with for loop:")
    for (i in 1..10 step 2) print(" $i")
    println()
    print("count even number from 10 down to 1 with for loop: ")
    for (i in 10 downTo 1 step 2) print("$i ")
    println()
    // for in Iterable
    println()
    val arr = arrayOf(1, 12, 31, 43252, 5425, 2352, 3241, 2, 314, 542, 6, 34, 6)
    print("number in arr[]: ")
    for (number in arr) print("$number ")
    // for (varName in List[.method])
    // List.withIndex() -> (index, value)
    println()
    println("\narr.withIndex()")
    for (pair in arr.withIndex()) println("Index = ${pair.index}, value = ${pair.value}") // can replace pair by (index, value)
    //List.indices -> index
    println()
    println("arr.indices")
    for (idx in arr.indices) println("Value at index $idx is ${arr[idx]} ")
    print("Press any key to continue ")
    readln()
    print("\u001b[H\u001b[2J") // clear console


    // unlabelled break: terminate current loop
    // labelled@ break: terminate labelled@ loop
    var num = 5
    label@ while (num > 0) {
        var num2 = 5
        defaultLabel@ while (num2 > 0) {
            if (num == 1)
                break@label // stop outer loop
            println("num = $num, num2 = $num2")
            --num2
            if (num2 < num) break // break@defaultLabel
        }
        --num
    }
    /* Console
    num = 5, num2 = 5 -> then num = 5, num2 = 4 -> break@defaultLabel
    num = 4, num2 = 5
    num = 4, num2 = 4 -> then num = 4, num2 = 3-> break@defaultLabel
    num = 3, num2 = 5
    num = 3, num2 = 4
    num = 3, num2 = 3 -> then num = 3, num2 = 2 -> break@defaultLabel
    num = 2, num2 = 5
    num = 2, num2 = 4
    num = 2, num2 = 3
    num = 2, num2 = 2 -> then num = 2, num2 = 1 -> break@defaultLabel
    then num1 = 1, num2 = 1 -> meet condition num1 == 1 in defaultLabel@ loop -> break@Lable
     */

    // same with labeled and unlabelled continue
}