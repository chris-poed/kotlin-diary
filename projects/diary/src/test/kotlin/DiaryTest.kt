import com.makers.diary.Diary
import com.makers.diary.DiaryEntry
import java.util.Date
import kotlin.test.Test

class DiaryTest {

    @Test
    fun testAddEntry() {
        val diary = Diary()
        val entry = DiaryEntry("An entry", "Hello", Date())

        diary.addEntry(entry)

        assert(diary.getAllEntries().count() == 1)
        assert(diary.getAllEntries().first().title == "An entry")
    }

    @Test
    fun testGetEntriesScheduledOn() {
        val diary = Diary()
        val entry1 = DiaryEntry("A first entry", "Hello", Date(2023, 1, 1))
        val entry2 = DiaryEntry("Another entry", "Hello", Date(2023, 1, 2))

        diary.addEntry(entry1)
        diary.addEntry(entry2)

        assert(diary.getAllEntriesScheduledOn(Date(2023, 1, 1)).count() == 1)
        assert(diary.getAllEntriesScheduledOn(Date(2023, 1, 1)).first().title == "A first entry")
    }
}