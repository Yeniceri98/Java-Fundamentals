package sections.sec21_Map;

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
}
