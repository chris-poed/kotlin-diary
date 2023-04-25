class Person(firstName: String, lastName: String, age: Int) {

    val fullName = "$firstName $lastName"

    fun getIntroduction(): String {
        return "Hi there, I'm ${fullName} - nice to meet you"
    }
}