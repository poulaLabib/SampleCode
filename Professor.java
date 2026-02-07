public class Professor extends Person {

    public Professor(String name, int age) {
        super(name, age);
    }

    public void teach(Course course) {
        System.out.println(name + " is teaching " + course.getTitle());
    }
}
