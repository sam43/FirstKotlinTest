
abstract class ClassB {
    abstract fun abc()
    fun abc(xd: Int) {
        println(xd.toString() + "\n")
    }
    fun abc(xd: Int, dx:String) {
        println("xd: $xd dx:$dx")
    }
    fun abcd() {
        println("fun abcd \n")
    }
    fun add(n1: String, n2:String) {
        println(n1.toInt() + n2.toInt())
    }
    fun add(n1: Int, n2:String) {
        println(n1 + n2.toInt())
    }
    fun concat(n1: String, n2:String) {
        println(n1 + n2)
    }
}