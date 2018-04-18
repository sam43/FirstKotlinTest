import java.util.*

open class SysIN {
    fun InOne () {
        //readLine()!!.split(' ')
        val input = Scanner(System.`in`)
        val a = input.nextInt()
        val b = input.nextInt()
        println(a.toInt() + b.toInt())
    }
    fun InTwo () {
        //readLine()!!.split(' ').map(String::toInt)
        val input = Scanner(System.`in`)
        val a = input.next()
        val b = input.next()
        println(a + b)
    }
    fun InThree () {
        val input = Scanner(System.`in`)
        val a = input.hasNext()
        val b = input.next()
        println(b)
    }
    fun InArrray() {
        val arrayint = Array(5) { readLine()!!.toInt() }
        /*for(x in 0 until arrayint.size) {
            println(arrayint[x])
        }*/
        /*for(x in 0 until arrayint.size) {
            //println(arrayint.sortedArray()[x])
        }
*/
        for (element in arrayint) {
            //println(element.dec()) // decrement/Increment (inc()) of each element in the array
            //println(element.div(2)) // divides with 2
            println(element.inv())
        }
    }

    fun readInts(separator: Char = ' ') = readLine()!!.split(separator).map(String::toInt)
}