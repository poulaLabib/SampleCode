public class Course {

    private String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void printCourseInformation() {
        System.out.println("Course title: " + title);
    }

    public void updateTitle(String newTitle) {
        if (newTitle != null && newTitle.length() > 3) {
            this.title = newTitle;
        }
    }

    public void displayTitleAnalysispp() {
        System.out.println("Title length: " + title.length());
        System.out.println("Uppercase title: " + title.toUpperCase());
    }

    // Placeholder methods kept for consistency, though their names are not ideal.
    public void placeholderMethod1() {
    }

    public void placeholderMethod2() {
    }

    public void placeholderMethod3gg() {
    }
    
    public void NewMethod8() {
}

    


}