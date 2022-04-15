

public class Time {
    private int second, hour, minute;

    public Time(int second, int hour, int minute) {
        this.second = second;
        this.hour = hour;
        this.minute = minute;
    }

    public Time(Time t) {
        this.hour = t.hour;
        this.minute = t.minute;
        this.second = t.second;

    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
}

