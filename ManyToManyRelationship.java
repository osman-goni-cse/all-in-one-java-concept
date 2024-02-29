import java.util.ArrayList;
import java.util.List;

class Student {
    private Long studentId;
    private String studentName;
    List<Course> courses;

    public Student(Long studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.getStudents().add(this);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
        course.getStudents().remove(this);
    }
}

class Course {
    private Long courseId;
    private String courseName;
    List<Student> students;

    public Course(Long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }
}

public class ManyToManyRelationship {
    public static void main(String[] args) {
        System.out.println("Many-to-Many relationship using core java");

        Student student1 = new Student(1L, "Osman");
        Student student2 = new Student(2L, "Farman");

        Course course1 = new Course(1L, "Math");
        Course course2 = new Course(2L, "Physics");

        student1.enrollInCourse(course2);
        student1.enrollInCourse(course1);

        student2.enrollInCourse(course1);

        System.out.println("***********************************");
        displayStudentCourses(student1);
        displayStudentCourses(student2);

        System.out.println("***********************************");

        displayCourseStudents(course1);
        displayCourseStudents(course2); 

    }
    private static void displayStudentCourses(Student student) {
        System.out.println("Student: " + student.getStudentName() + " is enrolled courses");
        for(Course course: student.getCourses()) {
            System.out.println(" - " + course.getCourseName());
        }
        System.out.println();
    }

    private static void displayCourseStudents(Course course) {
        System.out.println("Course " + course.getCourseName() + " is taken by: ");
        for(Student student: course.getStudents()) {
            System.out.println(" - " + student.getStudentName());
        }
    }
}
