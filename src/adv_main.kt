fun main (args: Array<String>) {

/*    var ss = 5
    val l = mutableListOf(1, 2, 3, 8, 9)
    l.addAll(listOf(15, 11, 17))
    println(l)
    l.add(0, 50)
    println(l)
    l.swap(l, 0, 4) // 'this' inside 'swap()' will hold the value of 'l'
    //println(l.swap(l, 0, 2))
    l.clear()
    println(l)

    fun foo(a: Int) {
        fun local(b: Int) {
            println(a + b)
        }
        return local(1)
    }

    for (x in 0..5) {
        foo(ss)
        ss++
    }

    infix fun String.foo(s: String) {
        println(s)
    }
// Call extension function.
    "test".foo("xyz")
// Or call extension function using infix notation.
    "test" foo "x"*/

    println("Start")

    val integer: Int = 1
    val num: Number = integer
    val nullableInteger: Int? = integer


    println(integer)
    println(num)
    println(nullableInteger)

    abstract class Animal(val size: Int)
    class Dog(val cuteness: Int): Animal(100)
    class Spider(val terrorFactor: Int): Animal(1)

    val dog: Dog = Dog(10)
    val spider: Spider = Spider(500)
    var animal: Animal = dog
    animal = spider

    println(animal.toString() +"\n"+ spider.toString())

    val dogList: List<Dog> = listOf(Dog(10), Dog(20))
    val animalList: List<Animal> = dogList

    val dogCompare: Compare<Dog> = object: Compare<Dog>() {
        override fun compare(first: Dog, second: Dog): Int {
            return first.cuteness - second.cuteness
        }
    }
    println(dogCompare.compare(Dog(10), Dog(20)))

   /* val animalCompare: Compare<Animal> = object: Compare<Animal> {
        override fun compare(first: Animal, second: Animal): Int {
            return first.size - second.size
        }
    }*/

}

abstract class Compare<T> {
    abstract fun compare(first: T, second: T) : Int
}
