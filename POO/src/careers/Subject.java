package careers;

public abstract class Subject {
    private String name;
    private String description;
    private String content;
    private int credits;

    public Subject(String name, String description, String content, int credits) {
        this.name = name;
        this.description = description;
        this.content = content;
        this.credits = credits;
    }
}
