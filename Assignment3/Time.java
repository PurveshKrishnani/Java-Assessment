package Assignment3;

import java.util.concurrent.TimeUnit;

public class Time {

    public Time() {
        this.hh = 0;
        this.mm = 0;
        this.ss = 0;
    }

    public Time(Integer hh, Integer mm, Integer ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    private Integer hh;
    private Integer mm;
    private Integer ss;

    public void  timeDifference(int h1 , int m1, int s1 , int h2, int m2,int s2)
    {
       int timeOne = h1*60*60 + m1*60 + s1;
       int timeTwo =  h2*60*60 + m2*60 + s2;
       int maxi = Math.max(timeTwo , timeOne);
       int mini;
       if(maxi == timeOne)
       {
           mini = timeTwo;
       }
       int diff = timeOne -timeTwo;

        long hh = TimeUnit.SECONDS.toHours(diff) % 24;
        long mm = TimeUnit.SECONDS.toMinutes(diff) % 60;
        long ss = TimeUnit.SECONDS.toSeconds(diff) % 60;

        System.out.println(hh +":"+ mm +":"+ ss);

    }

    public static void main(String[] args) {
        Time time = new Time();
        time.timeDifference(4, 40, 21, 2, 55, 40);
    }
}
