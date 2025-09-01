package bankEmployees;

public class ClerkEmployee extends Employee{

public ClerkEmployee (String name, int id, String DOB, String address){
    super(name, id, Constants.CLERK_TYPE, DOB, address, Constants.CLERK_SALARY);
}

    public void callCustomers() {
        System.out.println("Clerk " + getName() + " is calling a customer");
    }

    public void answerCall() {
        System.out.println("Clerk " + getName() + " is answering the phone");
    }

}
