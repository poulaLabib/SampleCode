public class Professor extends Person {

    private static final int EXCELLENT_GRADE_THRESHOLD = 85;
    private static final int GOOD_GRADE_THRESHOLD = 70;
    private static final int LONG_MEETING_DURATION_MINUTES = 120;
    private static final int WORKLOAD_HOURS_MULTIPLIER = 10;

    public Professor(String name, int age) {
        super(name, age);
    }

    public void teach(Course course) {
        System.out.println(name + " is teaching " + course.getTitle());
    }

    public void evaluateStudent(Student student, int grade) {
        System.out.println("Professor: " + name);
        System.out.println("Student: " + student.name);
        printGrade(grade);
    }

    private void printGrade(int grade) {
        if (grade > EXCELLENT_GRADE_THRESHOLD) {
            System.out.println("Grade: A");
        } else if (grade > GOOD_GRADE_THRESHOLD) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }

    public void holdMeeting(int durationMinutes) {
        if (durationMinutes > LONG_MEETING_DURATION_MINUTES) {
            System.out.println("Long meeting");
        } else {
            System.out.println("Short meeting");
        }
    }

    public void printWorkload(int courses, int students, int hours) {
        int workload = calculateWorkload(courses, students, hours);
        System.out.println("Workload score: " + workload);
    }

    private int calculateWorkload(int courses, int students, int hours) {
        return courses * students + hours * WORKLOAD_HOURS_MULTIPLIER;
    }

    public void NewMethod5() {
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Course {
    private String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}