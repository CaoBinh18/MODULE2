package AccessModifier;

import java.util.Scanner;

public class Test {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Nhap ten hoc sinh: ");
        String name = scanner.nextLine();
        System.out.println("Nhap ten lop: ");
        String classes = scanner.nextLine();

        Student student = new Student(name, classes);
//        System.out.println("Hoc sinh moi la " + student.getName());
        System.out.println(student.toString());
    }
}
