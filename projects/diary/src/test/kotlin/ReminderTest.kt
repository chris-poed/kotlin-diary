import com.makers.diary.Reminder
import kotlin.test.*

class ReminderTest {

    @Test
    fun `starts with a name`() {
        val reminder = Reminder("Chris")

        assertEquals("Chris", reminder.name)
    }

    @Test
    fun `starts with no task to remind`() {
        val reminder = Reminder("Chris")

        assertEquals("No task to remind", reminder.remind())
    }

    @Test
    fun `returns the reminder message`() {
        val reminder = Reminder("Chris")
        reminder.remindMeTo("Fit the hose")

        val result = reminder.remind()

        assertEquals("Fit the hose, Chris", result)
    }

}