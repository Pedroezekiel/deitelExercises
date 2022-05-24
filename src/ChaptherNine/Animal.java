package ChaptherNine;


import org.junit.jupiter.api.Test;

public class Animal extends LivingThing{
    public Animal(int something){
        System.out.println("I creating Animal");
    }
    @Override
    public  void move(){
        System.out.println("move like animal");
    }
    public  void yourFathersMove(){
        super.move();
    }
}
