class Person(
    val firstName: String,
    val lastName: String,
    val age: Int? = null,
    val hobbies: MutableList<String> = mutableListOf()
) {
    val fullName = "$firstName $lastName"
    fun getGreeting(): String {
        return "Hello there. I'm $fullName, how are you?"
    }
}