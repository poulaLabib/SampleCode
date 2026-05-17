public class Course {

    private String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void updateTitle(String newTitle) {
        if (newTitle != null && newTitle.length() > 3) {
            this.title = newTitle;
        }
    }

    public void displayCourseInformation() {
        System.out.println("Course title: " + title);
    }

    // Placeholder methods for demonstration. Consider renaming them to be more descriptive.
    public void performFirstAction() {
    }

    public void performSecondAction() {
    }

    public void performThirdAction() {
    }

    public void executeTaskAlpha() {
    }
}