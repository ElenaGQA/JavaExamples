package pagesLesson6_2;


public class PagesMain  {
    public static void main(String[] args) {

// new objects cannot be created with Page as this class is abstract
        LoginPage loginPage = new LoginPage();
        loginPage.setPagename("Login page"); // from Page, setter setPagename
        loginPage.setPageId(3);   // from Page, setter setPageId
        loginPage.setURL("www.legion.com/login");  // from Page, setter setURL
        loginPage.openPage();
        loginPage.closePage();
        loginPage.pressButton("Cancel");
        loginPage.setUsername("User1"); // from LoginPage
        loginPage.setPassword("12345");  // from LoginPage


        LoginPage loginPage1 = new LoginPage();
        loginPage1.getDeveloperName();

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();
        loginPage.getDeveloperName();
    }
}



