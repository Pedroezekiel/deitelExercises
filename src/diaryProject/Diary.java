package diaryProject;

import java.util.ArrayList;

public class Diary {
    private String name;
    private String password;
    ArrayList<Entry> entries;
    private String isLock;


    public Diary(String name,String password){
        this.name = name;
        this.password = password;
        entries = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String get_password() {
        return password;
    }

    public void createEntry(String title,  String body) {
        Entry diaryEntry = new Entry(title,body);
        entries.add(diaryEntry);
    }
    public int get_amount_of_entry(){
        return entries.size();
    }

    public int findEntry(String title) {
        for(int i = 0; i < entries.size(); i++){
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)){
                entries.get(i+1);
                return i+1;
            }
        }
        return -1;
    }

    public int remove_entry(String title) {
        for(int i = 0; i < entries.size(); i++){
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)){
                entries.remove(entry);
                return entries.size();
            }
        }

        return 0;
    }



    public String is_entry_open() {
        return password   ;
    }

    public void locked_entry(String password) {
        isLock = password;
    }
    public String isLock (){
        return isLock;

    }
}
