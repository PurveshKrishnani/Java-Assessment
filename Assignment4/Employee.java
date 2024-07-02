package Assignment4;

public  class Employee {

    private  Integer employeeId;
    private  double  salary;
    private String name;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Employee(String name, double salary, Integer employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public Employee() {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    private enum  ManagerType{;
        private String HR;
       private  String sales;
    }
}
