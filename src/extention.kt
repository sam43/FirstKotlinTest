
fun Int.ext_double () : Int {
    return this * 2
}

fun MutableList<Int>.swap(list_all: MutableList<Int>, index1: Int, index2: Int) {

    val tmp = list_all[index1] // 'this' corresponds to the list
    this[index1] = list_all[index2]
    this[index2] = tmp

    val list: MutableList<Int> = list_all

    println(list)
}

enum class Weeks {
    Saturday,
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday
}