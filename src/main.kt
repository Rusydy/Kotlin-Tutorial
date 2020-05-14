//fun main() {
//    println("Hello Kotlin")
//}

// #####Variable#####
    //val name: String = "Rusydy"
    //var name2: String? =  "Menulis"
    //
    //fun main() {
    //    println(name)
    //    println(name2)
    //}

// If else statement

//    val name = "Rusydy"
//    var greeting: String? = null
//
//    fun main() {
//        if (greeting != null){
//            println(greeting)
//        } else {
//            println("Hi")
//        }
//        println(name)
//    }

// when statement

//    val name = "Rusydy"
//    var greeting: String? = null
//
//    fun main() {
//        when (greeting) {
//            null -> println("Hi")
//            else -> println(greeting)
//        }
//        println(name)
//    }

// if expression

//    val name = "Rusydy"
//    var greeting: String? = null
//
//    fun main() {
//        val greetingToPrint = if (greeting != null) greeting else "Hi"
//        println(greetingToPrint)
//        println(name)
//    }

// when expression
//    val name = "Rusydy"
//    var greeting: String? = null
//
//    fun main() {
//        greeting = "Hello"
//        val greetingToPrint = when (greeting) {
//            null -> "Hi"
//            else -> greeting
//        }
//        println(greetingToPrint)
//        println(name)
//    }

// #####Basic Function#####

//fun getGreeting() = "Hello Rusydy"
//
//fun sayHello() {
//    println(getGreeting())
//}
//
//fun main() {
//    println("Hello World")
//    println(getGreeting())
//    sayHello()
//}

// parameter

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    sayHello(greeting = "Hello", itemToGreet = "Kotlin")
    sayHello(greeting = "Hi", itemToGreet = "Rusydy")
}