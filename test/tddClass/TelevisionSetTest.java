package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionSetTest {

    @Test
    public void onTest() {
        //when
        TelevisionSet myTv = new TelevisionSet();
        //given
        myTv.setTurnOn();
        //assert
        assertEquals(true, myTv.getTurnOn());
    }

    @Test
    public void offTest() {
        //when
        TelevisionSet myTv = new TelevisionSet();
        //given
        myTv.setTurnOn();
        myTv.setTurnOn();
        //assert
        assertEquals(false, myTv.getTurnOn());
    }

    @Test
    public void channelsTest(){
       //when
     TelevisionSet myTv = new TelevisionSet();
      //given
     myTv.setChannel(10);
     //assert
     assertEquals(10,myTv.getChannel());
    }
    @Test
    public void increaseChannelsTest(){
        //when
        TelevisionSet myTv = new TelevisionSet();
        //given
        myTv.setChannel(18);
        myTv.increaseChannel();
        myTv.increaseChannel();
        myTv.increaseChannel();
        myTv.increaseChannel();
        myTv.increaseChannel();
        myTv.increaseChannel();

        //assert
        assertEquals(20,myTv.getChannel());
    }
    @Test
    public void decreaseChannelsTest(){
        //when
        TelevisionSet myTv = new TelevisionSet();
        //given
        myTv.setChannel(1);
        myTv.decreaseChannel();
        myTv.decreaseChannel();
        myTv.decreaseChannel();
        myTv.decreaseChannel();
        myTv.decreaseChannel();
        myTv.decreaseChannel();
        //assert
        assertEquals(0,myTv.getChannel());
    }
    @Test
    public void volumeTest(){
      //when
     TelevisionSet myTv = new TelevisionSet();
     //given
     myTv.setVolume(10);
     //assert
     assertEquals(10,myTv.getVolume());
    }
    @Test
    public void increaseVolumeTest(){
        //when
     TelevisionSet myTv = new TelevisionSet();
       //given
     myTv.setVolume(98);
     myTv.increaseVolume();
     myTv.increaseVolume();
     myTv.increaseVolume();
     myTv.increaseVolume();
     myTv.increaseVolume();
      //assert
     assertEquals(101,myTv.getVolume());
    }
    @Test
    public void decreaseVolumeTest(){
       //when
    TelevisionSet myTv = new TelevisionSet();
      //given
    myTv.setVolume(10);
    myTv.decreaseVolume();
    myTv.decreaseVolume();
     //assert
    assertEquals(8,myTv.getVolume());
    }
    @Test
    public void televisionSetIsColouredTest(){
        //when
    TelevisionSet myTv = new TelevisionSet();
       //given
     myTv.setColour("colour");
     //assert
     assertEquals("colour",myTv.getColour());
    }
    @Test
    public void muteTelevisionSetTest(){
        //when
    TelevisionSet myTv = new TelevisionSet();
       //given
    myTv.setMute();
       //assert
    assertEquals(true,myTv.getMute());
    }
    @Test
    public void unMuteTeslevisionSetTest(){
        //when
    TelevisionSet myTv = new TelevisionSet();
       //given
    myTv.setMute();
    myTv.setMute();
     //assert
    assertEquals(false,myTv.getMute());

    }



}