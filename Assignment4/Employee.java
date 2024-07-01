package Assignment4;

public abstract class Employee {


    private String name;
    private  Integer employeeId;
    private  double  salary;

    public abstract void setSalary(double salary);

    private enum  ManagerType{;
        private String HR;
       private  String sales;
    }

    public Employee(String name, Integer employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }


    public Employee() {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }


    public double getSalary() {
        return salary;
    }



}
