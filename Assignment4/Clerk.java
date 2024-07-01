package Assignment4;

public class Clerk   extends Employee{

    public Clerk(String name, double salary, Integer employeeId, int speed, int accuracy) {
        super(name, salary, employeeId);
        this.speed = speed;
        this.accuracy = accuracy;
        setSalary(salary);
    }

    public Clerk(int speed, int accuracy) {
        this.speed = speed;
        this.accuracy = accuracy;
    }

    private  int speed;
    private  int  accuracy;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    public int getAccuracy() {
        return accuracy;
    }



    @Override
    public void setSalary(double salary) {
        if (speed >= 70 && accuracy >= 80) {
            super.setSalary(salary + 1000);
        } else {
            super.setSalary(salary);
        }
    }



    public  static  void main(String args[])
    {
        Clerk clerk = new Clerk("purvesh" ,15000,1001,50,50);



       System.out.println( clerk.getSalary());
       clerk.setSpeed(90);
       clerk.setAccuracy(90);
        clerk.setSalary(clerk.getSalary());

        System.out.println( clerk.getSalary());


        clerk.setSpeed(80);
        clerk.setAccuracy(80);
        clerk.setSalary(clerk.getSalary());

        System.out.println( clerk.getSalary());


    }

}


