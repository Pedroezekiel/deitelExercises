package diaryProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private LocalDateTime date = LocalDateTime.now();
    private  String title;
    private  String body;

    public Entry(String title,String body) {
        this.title = title;
        this.body = body;
        LocalDateTime date;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy, hh-mma");
        return  dateTimeFormatter.format(date);

    }
}
