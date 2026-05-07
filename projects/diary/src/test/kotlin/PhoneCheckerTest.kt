import com.makers.diary.PhoneChecker
import kotlin.test.Test
import kotlin.test.*

class PhoneCheckerTest {

    @Test
    fun testWithValidPhoneNumber() {
        val validPhoneNumber = "+44 123 456 7890"
        val phoneChecker = PhoneChecker()
        assertTrue(phoneChecker.isPhoneValid(validPhoneNumber))
    }

    @Test
    fun testWithInvalidPhoneNumber() {
        val invalidPhoneNumber = "123456"
        val phoneChecker = PhoneChecker()
        assertFalse(phoneChecker.isPhoneValid(invalidPhoneNumber))
    }
}