fun main() {
//     Creating an array
    // using arrayOf(elements) or arrayOf<Type>()
    val array = arrayOf(1, 3, 5, 7, 9)
    println("creating array with arrayOf(elements): ${array.contentToString()}")
    // using Array() constructor
    val numberElements = 5
    val array2 = Array(numberElements) {i -> i.shl(1)+1}
    println("creating array with Arrays(number_of_elements) {init_function}: ${array2.contentToString()}")
    // create using typeArrayOf(elements)

//    Accessing elements:
    // using get(idx) and set(idx, value)
    array.set(0, 10) // array = [10, 3, 5, 7, 9]
    println(array.get(0)) // 10
    // using indexing operator []
    array[0] = 1 // array = [1, 3, 5, 7, 9]
    println(array[0])

//    Iterating over an array:
    // using array.indices
    for (i in array.indices) print("${array[i]} ")
    println()
    //
    for (number in array) print("$number ")
    println()
    // using forEach()
    array.forEach { print("$it ") }
}