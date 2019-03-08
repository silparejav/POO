import careers.Career;
import careers.Course;
import persons.Professor;
import persons.Student;

public class University {

    public static void main(String[] args) {
        Student lucho = new Student(10123456,
                12345,
                "Lucho",
                "Garzon",
                21,
                "lucho.garzon@endava.com",
                "7417474",
                5);

        Student alejo = new Student(
                456789,
                987654,
                "Alejo",
                "Barreto",
                22,
                "alejo.barreto@endava.com",
                "9875614",
                9);

        Professor profeSergio = new Professor(
                321445657,
                54167,
                "Sergio",
                "Forero",
                20,
                "sergio.forero@endava.com",
                "8765241",
                1200000);

        Career systemEngineering = new Career(
                "System Engineering",
                1,
                1,
                "This is a good one");

        Course opp = new Course(
                "OPP",
                "OPP",
                "Tema 1, Tema 2, Tema 3",
                10);

        systemEngineering.addSubject(opp);
        opp.assignProfessor(profeSergio);
        opp.addStudent(lucho);
        opp.addStudent(alejo);

//        opp.addGradesByPeriod(lucho.getCode(),1,new Double[]{4.3,2.3,4.3});
//        opp.addGradesByPeriod(lucho.getCode(),2,new Double[]{4.3,2.3,4.3});
//        opp.addGradesByPeriod(lucho.getCode(),3,new Double[]{4.3,2.3,4.3});
//
//        opp.addGradesByPeriod(alejo.getCode(),1,new Double[]{3.3,2.3,4.3});
//        opp.addGradesByPeriod(alejo.getCode(),2,new Double[]{2.3,2.3,4.3});
//        opp.addGradesByPeriod(alejo.getCode(),3,new Double[]{3.3,2.3,4.3});

        System.out.println(profeSergio.sayHello());
        System.out.println(lucho.sayHello());
    }
}
