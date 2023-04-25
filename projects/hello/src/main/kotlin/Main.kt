fun whatIsThis(something: Any?): String {
    return when(something) {
        1 -> "One"
        is String -> "A string"
        else -> "Something else"
    }
}

class PhoneChecker {
    fun isPhoneValid(phone: String): Boolean {
        val regex = """^\s*(?:\+?(\d{1,3}))?[-. (]*(\d{3})[-. )]*(\d{3})[-. ]*(\d{4})(?: *x(\d+))?\s*$""".toRegex()
        return regex.matches(phone)
    }
}

fun greetWith(name: String, greetingFunction: (String) -> String): String {
    return greetingFunction(name)
}

fun main(args: Array<String>) {
    //print(whatIsThis(null))
    //println("Hello World!")

    println(PhoneChecker().isPhoneValid("07491140026"))

    greetWith("Leo") {
        it.uppercase()
    }

    fun ensureString(stringOrNull: String?): String {
        return stringOrNull ?: ""
    }

    fun sumAll(numbers: List<Int>): Int {
        return numbers.sum()
    }

    fun calculate(a: Int, b: Int, calculateFunction: (Int, Int) -> Int): Int {
        return calculateFunction(a, b)
    }

    println(calculate(2, 2) { a, b ->
        a - b
    })

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    val input = readln()

    println(input)

    val otherNames: List<String?> = listOf("Kat", "Marc", null)

    val aList: List<Any> = listOf(2, "hey", true)

    for (item in aList) {
        println(item)
    }

    for (name in otherNames) {
        //println(name.length)
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}