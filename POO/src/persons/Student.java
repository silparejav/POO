package persons;

import careers.Career;

public class Student extends Person {
        private int semester;
    private Career career;

    public Student(long cc, int code, String name, String lastName, int age, String email, String phone, int semester) {
        super(cc, code, name, lastName, age, email, phone);
        this.semester = semester;
    }

    public void assignCareer(Career career) {
        this.career = career;
    }

    @Override
    public String sayHello() {
        return "Hola teacher :)";
    }
}
