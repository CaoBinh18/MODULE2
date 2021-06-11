package IntroductionToJava;

import java.util.Scanner;

public class ConvertUSDVND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double rate = 23000;
        double USD = scanner.nextInt();
        double covert = 23000 * USD;

        System.out.print("VND = " + covert);
    }
}
