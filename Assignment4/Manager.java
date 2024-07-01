package Assignment4;

public class Manager  extends Employee{


    private  String type;

    public Manager(String name, double salary, Integer employeeId, String type) {
        super(name, salary, employeeId);
        this.type = type;
    }

    public Manager() {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public void setSalary(double salary) {
        if (type == "HR"){
            super.setSalary(salary + 10000);
        }
        if(type == "SALES"){
            super.setSalary(salary + 5000);
        }
    }



    public  static  void main(String args[])
    {
        Manager hrManager = new Manager("purvesh",15000,1001,"HR");
        hrManager.setSalary(hrManager.getSalary());
        System.out.print(hrManager.getSalary());

        System.out.println("");

        Manager salesManager = new Manager("chirag",15000,1002,"SALES");
        salesManager.setSalary(salesManager.getSalary());
        System.out.print(salesManager.getSalary());


    }



}
