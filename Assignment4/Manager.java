package Assignment4;

public class Manager  extends Employee{

    private  String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Manager(String name, Integer employeeId, double salary, String type) {
        super(name, employeeId, salary);
        this.type = type;
    }

    @Override
    public void setSalary(double salary) {
        if (type == "HR"){
           double  newsalary = salary+ 10000;
            setSalary(newsalary);
        }

        if(type == "SALES"){
            double newSalary = salary + 5000;
            setSalary(newSalary);
        }



    }

    public Manager() {
        this.type = type;
    }












}
