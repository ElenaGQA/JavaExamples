package bankEmployees;

public class ManagerEmployee extends Employee {

    public ManagerEmployee(String name, int id, String DOB, String address) {
        super(name, id, Constants.MANAGER_TYPE, DOB, address, Constants.MANAGER_SALARY);
    }

    public void hireEmployee() {
        System.out.println("Manager " + getName() + " is hiring an employee");
    }

    public void fireEmployee() {
        System.out.println("Manager " + getName() + " is firing an employee");
    }


}
