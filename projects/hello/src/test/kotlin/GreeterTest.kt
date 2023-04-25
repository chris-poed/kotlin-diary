import kotlin.test.Test
class GreeterTest {
    @Test fun testGreetsWithName() {
        val greeter = Greeter()

        assert(greeter.greet("Leo") == "Hi Leo!")
        assert(greeter.greet("Mary") == "Hi Mary!")
    }
}