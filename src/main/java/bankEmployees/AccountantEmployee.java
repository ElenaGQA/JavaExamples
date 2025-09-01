package bankEmployees;

public class AccountantEmployee extends Employee{

    public AccountantEmployee (String name, int id, String DOB, String address){
        super(name, id, Constants.ACCOUNTANT_TYPE, DOB, address, Constants.ACCOUNTANT_SALARY);
    }

    public void openAccount() {
        System.out.println("Accountant " + getName() + " is opening an account");
    }

    public void closeAccount() {
        System.out.println("Accountant " + getName() + " is closing an account");
    }

    public void createReport() {
        System.out.println("Accountant " + getName() + " creates report");
    }
}
