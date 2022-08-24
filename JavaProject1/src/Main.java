public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "Yazilim Geliştirici Yetistirme Kampi", "Java", "Engin Demirog");
        Course course2 = new Course(2, "Senior Yazilim Geliştirici Yetistirme Kampi", ".NET", "Engin Demirog");
        Course course3 = new Course(3, "Programlamaya Giriş için Temel Kurs", "basic programming", "Engin Demirog");

        Course[] courses = {course1, course2, course3};
        for (Course course : courses) {
            System.out.println(course.name);
        }

        Student student1 = new Student(1, "Tolga Ozkaya", "tolga@gmail.com", "tolga123");
        Student student2 = new Student(2, "Ahmet Ataca", "ahmet@gmail.com", "ahmet123");
        Student student3 = new Student(3, "Ebru Saygili", "ebru@gmail.com", "ebru123");

        Student[] students = {student1, student2, student3};
        for (Student student : students) {
            System.out.println(student.fullName);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);

        courseManager.deleteCourse(course1);
        courseManager.deleteCourse(course2);
        courseManager.deleteCourse(course3);

        StudentManger studentManger = new StudentManger();
        studentManger.addStudent(student1);
        studentManger.addStudent(student2);
        studentManger.addStudent(student3);

        studentManger.deleteStudent(student1);
        studentManger.deleteStudent(student2);
        studentManger.deleteStudent(student3);
    }
}
