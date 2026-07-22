package OOPS;

public class Student {
    int id;
    String name;
    String email;
    Course course;
  public Student(int id,String name,String email,Course course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
  }   // Student HAS-A Course
   // public Student(int id, String name, String email, Course course) {}
    void display() {
        System.out.println("the id of the student is : " + id);
        System.out.println("the name of the student is : " + name);
        System.out.println("the email of the student is : " + email);
        System.out.println("the course of the student is : " + course.cname);
        System.out.println("the fees of the course is : " + course.fees);
        System.out.println("the duration of the course is : " + course.duration);
    }
    public static void main(String[] args) {
        Course c1 = new Course("javafullstack", 8000, "6months");
        Student s1 = new Student(1, "anjali", "anjali@gmail.com", c1);
        s1.display();
    }
}
