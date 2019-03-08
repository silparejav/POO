package persons;

public class Professor extends Person {
    private double salary;

    public Professor(long cc, int code, String name, String lastName, int age, String email, String phone, double salary) {
        super(cc, code, name, lastName, age, email, phone);
        this.salary = salary;
    }

    @Override
    public String sayHello() {
        return "Hola clase :)";
    }
}
