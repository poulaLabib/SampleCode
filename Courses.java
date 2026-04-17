public class Courses {

    private String title;

    public Courses(String title) {
        this.title = title;
    }

    public void printCourseInformation() {
        System.out.println("Course title: " + title);
    }

    public void updateTitle(String newTitle) {
        if (newTitle != null && newTitle.length() > 3) {
            this.title = newTitle;
        }
    }

    // Placeholder methods kept for consistency, though their names are not ideal.
    public void placeholderMethod1() {
    }

    public void placeholderMethod2() {
    }

    public void placeholderMethod3() {
    }
    
    
    public void NewMethod9() {
}
    

    


}