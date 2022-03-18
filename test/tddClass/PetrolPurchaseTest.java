package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
  public void StationLocationTest(){
   //given
  PetrolPurchase myPetrolPurchase = new PetrolPurchase();
  //when
  myPetrolPurchase.setStationLocation();
  //assert
  assertEquals("ennyStation",myPetrolPurchase.getStationLocation());
    }
    @Test
  public void GasPetrolTypesTest(){
    //given
   PetrolPurchase myPetrolPurchase = new PetrolPurchase();
   //when
   myPetrolPurchase.setPetrolType();
   //assert
   assertEquals("Gas",myPetrolPurchase.getPetrolType());
    }
    @Test
   public void PetrolQuantityTest(){
    //given
    PetrolPurchase myPetrolPurchase = new PetrolPurchase();
    //when
    myPetrolPurchase.petrolQuantity();
    //assert
    assertEquals(20,myPetrolPurchase.getPetrolQuantity());
    }
    @Test
    public void PetroPerLitersTest(){
      //given
    PetrolPurchase myPetrolPurchase =new PetrolPurchase();
     //when
    myPetrolPurchase.petrolPerLiters();
     //assert
    assertEquals(25.73,myPetrolPurchase.getPetrolPerLiters());
    }
    @Test
    public void PetrolDiscountTest(){
       //given
    PetrolPurchase myPetrolPurchase = new PetrolPurchase();
      //when
    myPetrolPurchase. petrolDiscount(5);
    //assert
    assertEquals(1.2865000000000002,myPetrolPurchase.getPetrolDiscont());
    }
    @Test
    public void PetrolPurchaseTest(){
        //given
    PetrolPurchase myPetrolPurchase=new PetrolPurchase();
       //when
    myPetrolPurchase.petrolPurchaseAmount() ;
    //assert
    assertEquals(513.3135,myPetrolPurchase.getPetrolPurchaseAmount());
    }
}
