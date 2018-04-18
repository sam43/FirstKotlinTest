
fun main(args: Array<String>) {
    var x = 10
    val a = 5
    val wk: Weeks = Weeks.Wednesday
    var y: Int
    var z = 0
    var c = 0
    var c1 = 0
    val nums: IntArray = intArrayOf(10, 20, 30, 40, 50)
    println(nums)

    val list = arrayListOf(1, 2, 3)
    println(list) // [1, 2, 3]

    list += listOf(4, 5)
    println(list) // [1, 2, 3, 4, 5]

    val objA = CLassA()
    val objB = CLassA()
    val objC = CLassA()
    objA.sample()
    objA.abc()
    objA.abcd()
    objA.abbd()
    objA.abc(5)
    objA.abc(10, "Tests")
    objA.add(5, "10")
    objA.add("5", "15")
    objA.concat("Saadat ", "Sayem")


    val listof = arrayListOf(objA, objB, objC)
    println(listof) // [1, 2, 3]
    for (i in 0 until listof.size)
        println(listof[i].name)


    println("for each..")

    for (element in listof)
        println(element.name)

    println(10.ext_double())

    for (i in 0..25) {

        if (x > 30) {
            y = 4
            z = x + y
            c++
           // println("x > $x!$z count = $c\n")
        } else {
            y = 5
            c1++
            x += a
            z = x + y
            //println("x = $x!$z count = $c1\n")
        }
    }

    when (wk) {
        Weeks.Friday -> println("x = Friday")
        Weeks.Saturday -> println("x = Saturday")
        Weeks.Sunday -> println("x = Sunday")
        Weeks.Monday -> println("x = Monday")
        Weeks.Tuesday -> println("x = Tuesday")
        Weeks.Wednesday -> println("x = Wednesday")
        //Weeks.Thursday -> println("x = Thursday")
        // -> println("x == 2")
        else -> { // Note the block
            println("x is neither of any week")
            println("x = Thursday")
        }
    }
    
    println(Weeks.Friday)

    println("Hello World!$z count = $c @ $c1\n")
}