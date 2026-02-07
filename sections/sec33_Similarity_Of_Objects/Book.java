package sections.sec33_Similarity_Of_Objects;

public class Book {
    private String name;
    private int published;
    private String content;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public int getPublished() {
        return published;
    }

    public String toString() {
        return "Name: " + name + " (" + published + "). " + "Content: " + content;
    }

    public boolean isEquals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof Book)) {
            return false;
        }

        // let's convert the object to a Book-object
        Book comparedBook = (Book) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (name.equals(comparedBook.name) && published == comparedBook.published && content.equals(comparedBook.content)) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }
}
