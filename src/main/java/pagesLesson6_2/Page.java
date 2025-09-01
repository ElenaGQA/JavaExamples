package pagesLesson6_2;

public abstract class Page implements PageInterface{

    private String pagename;
    private int pageId;
    private String URL;

    // constructor is not possible in abstract class

    // we can use other methods as usual in an abstract class
    public String getURL() {
        return URL;
    }

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

    public abstract void getDeveloperName(); // abstract method cannot have a body
}







