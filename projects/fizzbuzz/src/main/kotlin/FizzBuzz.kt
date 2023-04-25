class FizzBuzz {
    fun calculate(number: Int): String {
        if (number.rem(3) == 0) {
            return "Fizz"
        }

        return number.toString()
    }
}