package objects;

public class Student {

    public String getFirst_name() {
        return first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getSex() {
        return sex;
    }
    
    public String getBirth_date() {
        return birth_date;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    private String first_name, middle_name, last_name, sex, birth_date;
    private int id, age;

    public Student(int id, String first_name, String middle_name, String last_name, int age, String sex, String birth_date) {
        this.id = id;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.age = age;
        this.sex = sex;
        this.birth_date = birth_date;
    }
    
    
}
