package lesson4strings;

public class LoginApp {

    public String expectedUserName = "admin";
    public String expectedPassword = "12345";

    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        boolean success = loginApp.verifyUser("admin", "54321"); // = empty, null = null, "  " = blank
        System.out.println("Login success is: " + success);
    }

    public boolean verifyUser(String username, String password) {
        username = username.toLowerCase();
        password= password.toLowerCase();
        boolean success = false;
        if (username == null || password == null) {                   //null - something completely empty
            System.out.println("The username or password is null");
        }
//        if (username.length() == 0 || password.length() == 0) {
        else if (username.isEmpty() || password.isEmpty()) {          // no input at all
            System.out.println("The username or password is empty");
        }
        else if (username.isBlank() || password.isBlank()) {          // verifies that string has only spaces
            System.out.println("The username or password is blank");
        }
//        else if (!username.equalsIgnoreCase(expectedUserName) || !password.equalsIgnoreCase(expectedPassword)) {
        else if (!username.equals(expectedUserName) || !password.equals(expectedPassword)) {          // verifies that string has only spaces
            System.out.println("The username or password does not match");
        }
        else{
            success = true;
            System.out.println("You are successfully logged in");
        }
        return success;
    }
}

