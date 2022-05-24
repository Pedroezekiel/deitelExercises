package myPratice;

import static java.lang.System.*;

public class useAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Barry Burd";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Jane Q. Public";
        yourAccount.address = "111 consumer Street";
        yourAccount.balance = 55.63;


        

        double myInterest = myAccount.getInterest(5.00);
        double yourInterest = yourAccount.getInterest(7.00);

        out.printf("$%4.2f\n",myInterest);
        out.printf("$%5.2f\n",myInterest);
        out.printf("$%.2f\n",myInterest);
        out.printf("$%3.4f\n",myInterest);
        out.printf("$%2f $%.2f",myInterest,yourInterest);


    }
}
