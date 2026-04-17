public class Course {

    private String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitlevv() {
        return title;
    }

    public void printInfo(String param2) {
        System.out.println("Course title: " + title);
    }

    public void renameCourse(String newTitle) {
        if (newTitle != null && newTitle.length() > 3) {
            this.title = newTitle;
        }
    }

    public void analyzeTitlehh() {
        System.out.println("Title length: " + title.length());
        System.out.println("Uppercase title: " + title.toUpperCase());
    }
    
    public void NewMethod5() {
}
    
    public void NewMethod6() {
}
    
    public void NewMethod7() {
}



}
