package pagesLesson6;


public class PagesMain {
    public static void main(String[] args) {

        // for public class as we have a constructor in our page class, it asks for arguments: pageName, pageId and URL
        Page loginScreen = new Page("Login", 1, "www.google.com/login");
        loginScreen.openPage();
        loginScreen.closePage();
        loginScreen.pressButton("Login");

        // for public class when empty constructor is added we can create a new object without arguments
        Page aboutScreen = new Page();
        aboutScreen.setPagename("About");
        aboutScreen.setPageId(2);
        aboutScreen.setURL("www.google.com/about");
        aboutScreen.openPage();
        aboutScreen.closePage();
        aboutScreen.pressButton("History");

        // this is used for private classes:
        LoginPage loginPage = new LoginPage();
        loginPage.setPagename("Login page"); // from Page, setter setPagename
        loginPage.setPageId(3);   // from Page, setter setPageId
        loginPage.setURL("www.legion.com/login");  // from Page, setter setURL
        loginPage.openPage();
        loginPage.closePage();
        loginPage.pressButton("Cancel");
        loginPage.setUsername("User1"); // from LoginPage
        loginPage.setPassword("12345");  // from LoginPage
        loginPage.populateCredentials();

        // This is an examples of polymorphism (another variant of inheritance):

        Page page = new Page();
        page.getDeveloperName();

        Page loginPage1 = new LoginPage();
        loginPage1.getDeveloperName();

        Page aboutPage = new AboutPage();
        aboutPage.getDeveloperName();

    }
}

//public class PagesMain {
//    public static void main(String[] args) {
//
//        Page loginScreen = new Page("Login", 1, "www.google.com/login");
//        loginScreen.pagename = "Login";
//        loginScreen.pageId = 1;
//        loginScreen.URL = "www.google.com/login";
//        loginScreen.openPage();
//        loginScreen.closePage();
//        loginScreen.pressButton("Login");
//
//        Page aboutScreen = new Page();
//        aboutScreen.pagename = "About";
//        aboutScreen.pageId = 2;
//        aboutScreen.URL = "www.google.com/about";
//        aboutScreen.openPage();
//        aboutScreen.closePage();
//        aboutScreen.pressButton("History");
//
//    }
//}


