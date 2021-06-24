package Sort.InsertionSort;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int k = list.length;
        for (int i = 1; i < k; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = sc.nextInt();
        int []list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

        System.out.println();
        InsertionSort ob = new InsertionSort();
        ob.insertionSort(list);
        insertionSort(list);
    }
}
