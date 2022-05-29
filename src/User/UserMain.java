package User;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("Tobi");
        System.out.println(user.getName());
        user.setName("Enny");
        System.out.println(user.getName());
        user.setPassword("*******");
        System.out.println(user.getPassword());
        user.setEmailAddress("name@gmail.com");
        System.out.println(user.getEmailAddress());
        user.setDateOfBirth("dd\\yy\\mm");
        System.out.println(user.getDateOfBirth());
        user.setPhoneNumber("081*********");
        System.out.println(user.getPhoneNumber());
    }
}
