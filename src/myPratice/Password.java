package myPratice;
import java.util.Random;

public class Password {
    public static void main(String[] args) {
        String upper ="QWERTYUIOPLKJHGFDSAZXCVBNM";
        String lower ="qwertyuioplkjhgfdsazxcvbnm";
        String number = "1234567890";
        String sign = "!@#$%^&*():?/.',";
        String combine = upper+lower+number+sign;
        Random random = new Random();
        char[] passwords = new char[12];
        for (int i = 0;i < passwords.length; i++){
            passwords[i] = combine.charAt(random.nextInt(combine.length()));
        }
        System.out.println(passwords);
    }

    }

