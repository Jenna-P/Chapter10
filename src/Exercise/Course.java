package Exercise;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName = "Learn Java";
    }
    public void addStudent(String student) {

    }
    public void dropStudent(String student){

    }
    public String[] getStudents() {
        return students;
    }
    public void setStudents(String[] students) {
      this.students = students;

    }
    public int getNumberOfStudents() {
        return numberOfStudents = 3;
    }

    public static void main(String[] args) {
        Course c = new Course("LearnJava");
        c.setStudents(new String[]{"A", "B", "C"});
        System.out.println(c.getCourseName());
        System.out.println(c.getNumberOfStudents());

        for (int i = 0; i < 3; i++) {
            System.out.println(c.students[i]);
        }

    }
}
