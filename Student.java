public class Student extends Person {
    private Course course; // Association

    public Student(String name, int age, Course course) {
        super(name, age);
        this.course = course;
    }

    public void study() {
        System.out.println(name + " is studying " + course.getTitle());
    }
}
