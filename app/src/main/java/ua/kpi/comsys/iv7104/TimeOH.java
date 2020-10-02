package ua.kpi.comsys.iv7104;

import java.sql.Time;

//task 3 : OH = Oleksandr Humeniuk Group IV-71
public class TimeOH {
    //task 4
    private int hours, minutes, seconds;

    //task 5 constructor 1
    public TimeOH(){
        hours = minutes = seconds = 0;
    }

    //task 5 constructor 2
    public TimeOH(int hours, int minutes, int seconds) throws Exception {
        if(hours < 0 || hours > 23) throw new Exception("Incorrect hours");
        if(minutes < 0 || minutes > 59) throw new Exception("Incorrect minutes");
        if(seconds < 0 || seconds > 59) throw new Exception("Incorrect seconds");

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //task 5 constructor 3
    public TimeOH(Time time){
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    //task 6 method 1
    @Override
    public String toString() {
        return (((hours > 12 ) ? hours - 12 : hours) + ":" + minutes + ":" + seconds + " " + ((hours > 12 ) ? "PM" : "AM"));
    }

    //task 6 method 2
    public TimeOH sum (TimeOH timeOH) throws Exception {
        Time date1 = new Time(this.hours, this.minutes, this.seconds);
        Time date2 = new Time(timeOH.getHours(), timeOH.getMinutes(), timeOH.getSeconds());

        long sum = (date1.getTime() + date2.getTime() + 10800000);
        Time sumDate = new Time(sum);

        return new TimeOH(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }

    // task 6 method 3
    public TimeOH diff (TimeOH timeOH) throws Exception {
        Time date1 = new Time(this.hours, this.minutes, this.seconds);
        Time date2 = new Time(timeOH.getHours(), timeOH.getMinutes(), timeOH.getSeconds());

        long sum = (date1.getTime() - date2.getTime() - 10800000);
        Time sumDate = new Time(sum);

        return new TimeOH(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }

    //task 7 class method 1
    public static TimeOH sum (TimeOH time1, TimeOH time2) throws Exception {
        Time date1 = new Time(time1.hours, time1.minutes, time1.seconds);
        Time date2 = new Time(time2.hours, time2.minutes, time2.seconds);

        long sum = (date1.getTime() + date2.getTime() + 10800000);
        Time sumDate = new Time(sum);

        return new TimeOH(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }

    //task 7 class method 2
    public static TimeOH diff (TimeOH time1, TimeOH time2) throws Exception {
        Time date1 = new Time(time1.hours, time1.minutes, time1.seconds);
        Time date2 = new Time(time2.hours, time2.minutes, time2.seconds);

        long sum = (date1.getTime() - date2.getTime() - 10800000);
        Time sumDate = new Time(sum);

        return new TimeOH(sumDate.getHours(),
                sumDate.getMinutes(),
                sumDate.getSeconds());
    }
}
