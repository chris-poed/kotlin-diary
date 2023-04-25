import kotlin.test.Test

class FizzbuzzTest {
    @Test
    fun testFizzBuzz() {
        val fizzbuzz = FizzBuzz()

        assert(fizzbuzz.calculate(1) == "1")
        assert(fizzbuzz.calculate(2) == "2")
        assert(fizzbuzz.calculate(3) == "Fizz")
        assert(fizzbuzz.calculate(4) == "4")
    }
}