package User;

public class User {
   private String name;
   private String emailAddress;
   private String phoneNumber;
   private String dateOfBirth;
   private String password;


    public User(String name){
        this.name = name;
    }
    public  User(String name, String emailAddress, String phoneNumber, String dateOfBirth, String password){
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
         this.dateOfBirth = dateOfBirth;
         this.password = password;
    }
    public  User(){

    }
    public String getName(){
        return name;
    }
    public String getEmailAddress(){
        return  emailAddress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getPassword(){
        return password;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public String setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return  emailAddress;
    }
    public String setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public String setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        return dateOfBirth;
    }
    public String setPassword(String password){
        this.password = password;
        return password;
    }


}

