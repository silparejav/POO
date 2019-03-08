package careers;

import java.util.ArrayList;
import java.util.List;

public class Career {
    private String name;
    private int code;
    private int credits;
    private String description;
    private List<Subject> subjects;

    public Career(String name, int code, int credits, String description) {
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.description = description;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}

