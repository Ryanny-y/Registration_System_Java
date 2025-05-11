package objects;

public class Course {
    String course_code, course_name, instructor_name;
    int credits, max_capacity;

    public Course(String course_code, String course_name, String instructor_name, int credits, int max_capacity) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.instructor_name = instructor_name;
        this.credits = credits;
        this.max_capacity = max_capacity;
    }

    public String getCourse_code() {
        return course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public int getCredits() {
        return credits;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    
}
