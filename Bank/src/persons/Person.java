package persons;

public abstract class Person {
    private String name;
    private String lastname;
    protected long cc;

    public Person(String name, String lastName, long cc) {
        this.name = name;
        this.lastname = lastName;
        this.cc = cc;
    }

    public String getName() {
        return name;
    }
}
