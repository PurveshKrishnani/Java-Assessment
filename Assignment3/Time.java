package Assignment3;

import java.util.concurrent.TimeUnit;
import  java.util.Scanner;
public class Time {


    private Integer h1 , m1,s1;
    private Integer h2,m2,s2;


    private void input() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first time (hh:mm:ss): ");
        String time1 = scanner.nextLine();
        String[] time1Parts = time1.split(":");
        h1 = Integer.parseInt(time1Parts[0]);
        m1 = Integer.parseInt(time1Parts[1]);
        s1 = Integer.parseInt(time1Parts[2]);

        System.out.print("Enter the second time (hh:mm:ss): ");
        String time2 = scanner.nextLine();
        String[] time2Parts = time2.split(":");
        h2 = Integer.parseInt(time2Parts[0]);
        m2 = Integer.parseInt(time2Parts[1]);
        s2 = Integer.parseInt(time2Parts[2]);
    }


    public Time() {
        this.h1 = h1;
        this.m1 = m1;
        this.s1 = s1;
        this.h2 = h2;
        this.m2 = m2;
        this.s2 = s2;
    }


    public void  timeDifference()
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
        time.input();
        time.timeDifference();
    }


}
