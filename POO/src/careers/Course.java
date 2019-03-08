package careers;

import persons.Professor;
import persons.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course extends Subject {
    private static final int PERIODS = 3;
    private Professor professor;
    private List<Student> students;
    private Map<Integer, Map<Integer, Double[]>> grades;

    public Course(String name, String description, String content, int credits) {
        super(name, description, content, credits);
        this.students = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addGradesByPeriod(int code, int period, Double[] grades) {
        Map<Integer, Double[]> gradesPerPeriods = new HashMap<Integer, Double[]>();
        gradesPerPeriods.put(period, grades);
        if (this.grades.containsKey(code)) {
            this.grades.get(code).put(period, grades);
        } else {
            this.grades.put(code, gradesPerPeriods);
        }
    }
}
