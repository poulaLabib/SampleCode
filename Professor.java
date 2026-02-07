public class Professor extends Person {

    public Professor(String name, int age) {
        super(name, age);
    }

    public void teach(Course course) {
        System.out.println(name + " is teaching " + course.getTitle());
    }

    public void evaluateStudent(Student student, int grade) {
        System.out.println("Professor: " + name);
        System.out.println("Student: " + student.name);
        if (grade > 85) {
            System.out.println("Grade: A");
        } else if (grade > 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }

    public void holdMeeting(int durationMinutes) {
        if (durationMinutes > 120) {
            System.out.println("Long meeting");
        } else {
            System.out.println("Short meeting");
        }
    }

    public void printWorkload(int courses, int students, int hours) {
        int workload = courses * students + hours * 10;
        System.out.println("Workload score: " + workload);
    }
}
