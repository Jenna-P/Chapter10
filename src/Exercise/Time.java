package Exercise;

public class Time {
    long hour;
    long minute;
    long second;

    public Time() {
        this.hour = (((System.currentTimeMillis() / 1000) / 60) / 60 ) % 24;
        this.minute = ((System.currentTimeMillis() / 1000) / 60) % 60;
        this.second = (System.currentTimeMillis() / 1000) % 60;
    }

    public Time(long totalMilliSeconds) {
        totalMilliSeconds = System.currentTimeMillis();

    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {

    }
}