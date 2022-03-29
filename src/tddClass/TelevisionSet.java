package tddClass;

public class TelevisionSet {

    private boolean turnOn;
    private int channel;
    private int volume;
    private String colour;
    private boolean mute;

    public void setTurnOn() {
        if (turnOn == false) {
            turnOn = true;
        } else if (turnOn == true) {
            turnOn = false;
        }
    }

    public boolean getTurnOn() {
        return turnOn;
    }


    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void increaseChannel() {
        if(channel>0 && channel<=20){
            this.channel=channel +1;}
        else if(channel>20){
            channel = 20;
        }
    }


    public void decreaseChannel() {
        if(channel>0 && channel<20){
            this.channel = channel - 1;}
        else if(channel<0){
            channel = 0;
        }

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(volume>0 && volume<=100){
            this.volume = volume + 1;
        }else if(volume>100){
            volume=100;
        }
    }

    public void decreaseVolume() {
        if (volume > 0 && volume <= 100) {
            this.volume = volume - 1;
        } else if (volume < 0){
            volume=0;
        }
    }

    public void setColour(String colour)
    {this.colour = colour;}
    public String getColour(){
        return colour;
    }

    public void setMute() {
        if(mute==false){mute=true;}
        else if(mute==true){mute=false;}
    }

    public boolean getMute() {
        return  mute;
    }
}

