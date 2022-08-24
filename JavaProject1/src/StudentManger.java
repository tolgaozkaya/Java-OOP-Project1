public class StudentManger {
    public void addStudent(Student student){
        System.out.println("Student Name: " + "'" + student.fullName + "'" + " added on database..");
    }

    public void deleteStudent(Student student){
        System.out.println("Student Name: " + "'" + student.fullName + "'" + " deleted on database..");
    }
}
