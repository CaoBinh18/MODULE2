package Array.minArray;

import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        System.out.printf("Nhap do dai mang: ");
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
    }

    public static int minArray(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
