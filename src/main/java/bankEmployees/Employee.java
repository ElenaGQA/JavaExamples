package bankEmployees;

public abstract class Employee {

    private String name;
    private int id;
    private String title;
    private String DOB;
    private double salary;
    private String address;

    public Employee(String name, int id, String title, String DOB, String address, double salary) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.DOB = DOB;
        this.address = address;
        this.salary = salary;
    }


    public void receiveSalary() {
        System.out.println(String.format("%s %s received salary of $%.2f", title, name, salary));
    }

    @Override
    public String toString() {
       return String.format("[Name: %s, ID: %d Title: %s, Address: %s, Birth Date: %s, Salary: $%.2f]",name, id, title,address, DOB, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDOB() {
        return DOB;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
