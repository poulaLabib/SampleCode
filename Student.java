public class Student extends Person {
    private Course course;

    public Student(String name, int age, Course course) {
        super(name, age);
        this.course = course;
    }

    public void study() {
        System.out.println(name + " is studying " + course.getTitle());
    }

    public void printSchedule() {
        System.out.println("Student: " + name);
        System.out.println("Course title: " + course.getTitle());
        System.out.println("Course title length: " + course.getTitle().length());
        System.out.println("Uppercase title: " + course.getTitle().toUpperCase());
    }

    public void changeCourse(Course newCourse) {
        if (newCourse != null) {
            this.course = newCourse;
        }
    }

    public void evaluatePerformance(int attendance, int assignments, int examScore) {
        int total = attendance + assignments + examScore;
        if (total > 180) {
            System.out.println(name + " performance: Excellent");
        } else if (total > 120) {
            System.out.println(name + " performance: Good");
        } else {
            System.out.println(name + " performance: Poor");
        }
    }
}
