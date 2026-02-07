public class Course {
    private String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        System.out.println("Course title: " + title);
    }

    public void renameCourse(String newTitle) {
        if (newTitle != null && newTitle.length() > 3) {
            this.title = newTitle;
        }
    }

    public void analyzeTitle() {
        System.out.println("Title length: " + title.length());
        System.out.println("Uppercase title: " + title.toUpperCase());
    }
}
