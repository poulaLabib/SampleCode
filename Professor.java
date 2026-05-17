public class Professor extends Person {

    private static final int GRADE_THRESHOLD_A = 85;
    private static final int GRADE_THRESHOLD_B = 70;
    private static final int MEETING_DURATION_LONG = 120;
    private static final int HOURS_WEIGHT_IN_WORKLOAD = 10;

    public Professor(String name, int age) {
        super(name, age);
    }

    public void teach(Course course) {
        System.out.println(name + " is teaching " + course.getTitle());
    }

    public void evaluateStudent(Student student, int grade) {
        System.out.println("Professor: " + name);
        System.out.println("Student: " + student.name);
        if (grade > GRADE_THRESHOLD_A) {
            System.out.println("Grade: A");
        } else if (grade > GRADE_THRESHOLD_B) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }

    public void holdMeeting(int durationMinutes) {
        if (durationMinutes > MEETING_DURATION_LONG) {
            System.out.println("Long meeting");
        } else {
            System.out.println("Short meeting");
        }
    }

    public void printWorkload(int courses, int students, int hours) {
        int workload = courses * students + hours * HOURS_WEIGHT_IN_WORKLOAD;
        System.out.println("Workload score: " + workload);
    }
    
    public void NewMethod5() {
    }
}