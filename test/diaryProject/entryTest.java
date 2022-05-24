package diaryProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class entryTest {
    private Entry entry;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy, hh-mma");
    private String date = dateTimeFormatter.format(LocalDateTime.now());

    @BeforeEach
    public void setUp(){
        entry = new Entry("I don't know","i love java");
    }
    @Test
    public void entryCanBeCreated(){
        assertNotNull(entry);
    }
    @Test
    public void titleCanBeAdded(){
        assertEquals("I don't know",entry.getTitle());
    }
    @Test
    public  void bodyCanBeAdded(){
        assertEquals("i love java",entry.getBody());
    }
    @Test
    public  void dateCanBeAdded(){
        assertEquals(date, entry.getDate());
    }
}
