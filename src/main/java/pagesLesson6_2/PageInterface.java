package pagesLesson6_2;

interface  PageInterface {
    public void getDeveloperName();
}

// interface cannot have any functionality inside, it tells all others that this functionality has to be inside them.
// all methods of interface have to be implemented.
// public class Page implements PageInterface{} -