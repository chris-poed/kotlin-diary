import kotlin.test.Test
import com.makers.diary.Person
import kotlin.test.assertEquals

class PersonTest {
    @Test
    fun testsPersonGreeting() {
        val person = Person("Neo", "Smith")

        assertEquals("Hello there. I'm Neo Smith, how are you?", person.getGreeting())
    }
}