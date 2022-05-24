package chapter3;

public class Clock {
    private int hour;
    private int second;
    private int minute;

    public void setClockHour(int hour, int second, int minute) {
        this.hour = hour;
    }

    public int getClockHour() {
        return hour;
    }


    public void setClockSecond(int hour, int second, int minute) {
        this.second = second;

    }

    public int getClockSecond() {
        return second;
    }

    public void setClockMinute(int hour, int second, int minute) {
        this.minute = minute;
    }

    public int getClockMinute() {
        return minute;
    }


    public void displayClock() {
        if (hour > 23 && second > 59 && minute > 59) {
            hour = 0;
            second = 0;
            minute = 0;
            int time = hour + second + minute;
        }
    }

    public int getdisplayClock() {
        return  hour + second + minute;
    }
}