
fun main(args: Array<String>) {
    var x = 10
    val a = 5
    var y: Int
    var z = 0
    var c = 0
    var c1 = 0

    val objA = CLassA()
    objA.sample()
    objA.abc()
    objA.abcd()
    objA.abbd()
    for (i in 0..25) {

        if (x > 30) {
            y = 4
            z = x + i
            c++
           // print("x > $x!$z count = $c\n")
        } else {
            y = 5
            c1++
            x += a
            z = x + i
            //print("x = $x!$z count = $c1\n")
        }
    }

    print("Hello World!$z count = $c @ $c1\n")
}