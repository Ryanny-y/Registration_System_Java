package objects;

public class Active_Student {
    private static Student active_student;
    
    public static Student getActiveStudent() {
        return active_student;
    }
    
    public static void setActiveStudent(Student active_student) {
        Active_Student.active_student = active_student;
    }
}
