package pagesLesson6;

public class LoginPage extends Page {
    private String username;
    private String password;


    public void populateCredentials() {
        System.out.println(String.format("Credentials are populated: %s, %s", username, password));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void getDeveloperName() {
        System.out.println("John Smith");
    }
}
