import kotlin.test.Test

class PersonTest {
    @Test fun testsPersonGreeting() {
        val person = Person("Neo", "Neo")

        assert(person.getGreeting() == "Hello there. I'm Neo, how are you?")
    }
}