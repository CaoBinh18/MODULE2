package baitap.testcodelearn;

public class Student {
    private String name;
    private int age;

    public static int numberOfStudents;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudents++;
    }
}

class Entry {
    public static void main(String[] args) {
        Student s1 = new Student("Manh", 19);
        Student s2 = new Student("Trung", 19);
        Student s3 = new Student("Kien", 19);
        System.out.println(Student.numberOfStudents);
    }
}
