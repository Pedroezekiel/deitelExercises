package diaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;


public class diaryEntryTest {
         @Test
    public void testThatDiaryHasBeenCreated(){
                Diary diary = new Diary("secret Keeper", "1022");
                assertNotNull(diary);
         }
         @Test
    public void test_that_diary_has_a_name(){
             Diary diary = new Diary("secret Keeper", "1022");
             diary.setName("my diary");
             assertEquals("my diary",diary.get_name());
         }
         @Test
    public void test_that_diary_has_a_password(){
             Diary diary = new Diary("secret Keeper", "1022");
             diary.setPassword("5055");
             assertEquals("5055",diary.get_password());
         }
         @Test
    public void test_that_diary_can_have_an_entry(){
             Diary diary = new Diary("secret Keeper", "1022");
             diary.createEntry("my diary","i love python");
             diary.createEntry("diary","i love python");
             assertEquals(2,diary.get_amount_of_entry());
         }
         @Test
    public void test_that_entry_can_be_found(){
             Diary diary = new Diary("secret Keeper", "1022");
             diary.createEntry("my diary","i love python");
             diary.createEntry("diary","i love java");
             diary.createEntry("my ","i love python");
             diary.createEntry("do","i love python");
             int position = diary.findEntry("diary");
             assertEquals(2,position);
         }
         @Test
    public void test_can_be_deleted(){
             Diary diary = new Diary("secret Keeper", "1022");
             diary.createEntry("my diary","i love python");
             diary.createEntry("diary","i love java");
             diary.createEntry("my ","i love python");
             diary.createEntry("do","i love python");
             int position = diary.remove_entry("diary");
             assertEquals(3,position);
         }
         @Test
    public void test_that_entry_is_locked(){
             Diary diary = new Diary("secret Keeper", "1022");
              assertEquals("1022",diary.is_entry_open());
         }
         @Test
    public void test_that_diary_is_locked(){
             Diary diary = new Diary("secret Keeper", "1022");
             diary.locked_entry("1234");
             assertEquals("1234",diary.isLock());
         }

    }

