package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest{

    @Test
    public void depositTest(){
        // given
        Account funmiAccount = new Account();
        //when
        funmiAccount.deposit(100);
        //assert
        assertEquals(100, funmiAccount.getBalance());

    }

    @Test
    public void depositTwiceTest(){
        Account funmiAccount = new Account();
        funmiAccount.deposit(500);
        funmiAccount.deposit(400);
        assertEquals(500+400,funmiAccount.getBalance());
    }

    @Test
    @DisplayName("Test that nagative will not work")
    public void nagativeDepositTest(){
      Account  funmiAccount = new Account();
      funmiAccount.deposit(1000);
      funmiAccount.deposit(-500);
      assertEquals(1000,funmiAccount.getBalance());
    }

   @Test
    public void withdrawalTest() {
       //given
       Account ezekielAccount = new Account();
       //when
       ezekielAccount.deposit(2000);
       ezekielAccount.withdrawal(2000);
       //assert
       assertEquals(0, ezekielAccount.getBalance());
   }
    @Test
    public void excessWithdrawalTest(){
           Account ezekielAccount = new Account();
           ezekielAccount.deposit(200);
           ezekielAccount.withdrawal(400);
           assertEquals(200, ezekielAccount.getBalance());
    }
    @Test
    public void nativeWithdrawalTest() {
        Account ezekielAccount = new Account();
        ezekielAccount.deposit(1500);
        ezekielAccount.withdrawal(-500);
        assertEquals(1500, ezekielAccount.getBalance());
    }
    @Test
    public void withdrawalTwiceTest() {
        Account ezekielAccount = new Account();
        ezekielAccount.deposit(5000);
        ezekielAccount.withdrawal(1000);
        ezekielAccount.withdrawal(3000);
        assertEquals(1000, ezekielAccount.getBalance());




    }

}
