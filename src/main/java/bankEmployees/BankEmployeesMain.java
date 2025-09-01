package bankEmployees;

public class BankEmployeesMain {
    public static void main(String[] args) {

        ManagerEmployee manager = new ManagerEmployee("John Smith", 110, "23.10.75", "Toronto");
        manager.hireEmployee();
        manager.fireEmployee();
        manager.receiveSalary();
        System.out.println( manager.toString());

        ClerkEmployee clerk1 = new ClerkEmployee( "Mary Johnson", 312, "12.03.84", "Woodbridge");
        clerk1.callCustomers();
        clerk1.answerCall();
        clerk1.receiveSalary();
        System.out.println(clerk1.toString());

        ClerkEmployee clerk2 = new ClerkEmployee( "David Brown", 323, "05.11.91", "Vaughn");
        clerk2.callCustomers();
        clerk2.answerCall();
        clerk2.receiveSalary();
        System.out.println(clerk2.toString());

        ClerkEmployee clerk3 = new ClerkEmployee( "Sarah Davis", 341, "19.05.82", "Toronto");
        clerk3.callCustomers();
        clerk3.answerCall();
        clerk3.receiveSalary();
        System.out.println(clerk3.toString());

        AccountantEmployee accountant1 = new AccountantEmployee("Michael Wilson", 219, "01.03.77", "Maple");
        accountant1.openAccount();
        accountant1.closeAccount();
        accountant1.createReport();
        accountant1.receiveSalary();
        System.out.println(accountant1.toString());

        AccountantEmployee accountant2 = new AccountantEmployee("Emily Taylor", 245, "11.07.99", "Oshawa");
        accountant2.openAccount();
        accountant2.closeAccount();
        accountant2.createReport();
        accountant2.receiveSalary();
        System.out.println(accountant2.toString());

        AccountantEmployee accountant3 = new AccountantEmployee("James Moore", 233, "28.12.86", "Newmarket");
        accountant3.openAccount();
        accountant3.closeAccount();
        accountant3.createReport();
        accountant3.receiveSalary();
        System.out.println(accountant3.toString());

        AccountantEmployee accountant4 = new AccountantEmployee("Laura Anderson", 242, "30.01.67", "Toronto");
        accountant4.openAccount();
        accountant4.closeAccount();
        accountant4.createReport();
        accountant4.receiveSalary();
        System.out.println(accountant4.toString());

        AccountantEmployee accountant5 = new AccountantEmployee("Robert Thomas", 210, "14.03.85", "Oakville");
        accountant5.openAccount();
        accountant5.closeAccount();
        accountant5.createReport();
        accountant5.receiveSalary();
        System.out.println(accountant5.toString());


    }
}
