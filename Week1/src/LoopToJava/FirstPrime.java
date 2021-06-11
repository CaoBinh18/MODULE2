package LoopToJava;

import java.util.Scanner;

public class FirstPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of Prime: ");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;

        while (count < number) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.printf("%d\t", N);
                count++;
            }
            N++;
        }
    }
}
