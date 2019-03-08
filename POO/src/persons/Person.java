package persons;

public abstract class Person implements IMyFirstDay {
    private String name;
    private String lastName;
    private long cc;
    private int age;
    private String email;
    private String phone;
    private int code;

    public Person(long cc, int code, String name, String lastName, int age, String email, String phone) {
        this.cc = cc;
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public int getCode() {
        return code;
    }

}
