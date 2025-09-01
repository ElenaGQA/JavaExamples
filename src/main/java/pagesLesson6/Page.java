package pagesLesson6;

public class Page {

    private String pagename;
    private int pageId;
    private String URL;

    public Page(String pagename, int pageId, String URL) {
        this.pagename = pagename;
        this.pageId = pageId;
        this.URL = URL;
    }

    // we can have multiple constructors
    // empty constructor is used for without values
    public Page() {

    }


    // getters and setters are used to access and set arguments in private classes:
    public String getURL() {
        return URL;
    }

    // if one attribute needs to be unchangeable, do not write setter and have it assigned in the class
    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }



    public void openPage() {
        System.out.println(String.format("Page %s was opened, link is %s", pagename, URL));
    }

    public void closePage() {
        System.out.println(String.format("Page %s was closed", pagename));
    }

    public void pressButton(String buttonName) {
        System.out.println(String.format("Button %s was clicked", buttonName));
    }

    public void getDeveloperName() {
        System.out.println("This page was developed by: ");
    }
}

//public class Page {
//
//    String pagename;
//    int pageId;
//    String URL;
//
//    public Page(String pagename, int pageId, String URL){
//        this.pagename = pagename;
//        this.pageId = pageId;
//        this.URL = URL;
//    }
//
//    public Page(){ // empty constructor is used for without values
//
//    }
//
//
//    public void openPage(){
//        System.out.println(String.format("Page %s was opened", pagename));
//    }
//
//    public void closePage(){
//        System.out.println(String.format("Page %s was closed", pagename));
//    }
//
//    public void pressButton (String buttonName){
//        System.out.println(String.format("Button %s was clicked", buttonName));
//    }
//}





