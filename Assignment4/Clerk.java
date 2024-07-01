package Assignment4;

public class Clerk   extends Employee{

    private  int speed;
    private  int  accuracy;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }


    public Clerk(String name, Integer employeeId, double salary, int speed, int accuracy) {
        super(name, employeeId, salary);
        this.speed = speed;
        this.accuracy = accuracy;
    }

    public Clerk() {
        this.speed = speed;
        this.accuracy = accuracy;
    }


    @Override
    public void setSalary(double salary) {

        if(speed > 70 &&   accuracy > 80 )
        {
            double newsalary = salary +1000;
            setSalary(newsalary);
        }

    }
}
