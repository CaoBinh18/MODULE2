package baitap.oopAtm;

import java.beans.Customizer;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ngan hang ABC kinh chao Quy khach Nguyen Van A");
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Nhan phim A de kiem tra tai khoan");
            System.out.println("2. Nhan phim D de nap tien");
            System.out.println("3. Nhan phim W de rut tien");
            System.out.println("4. Nhan phim H de xem lich su 3 lan");
            System.out.println("5. Nhan phim X de thoat");
            System.out.println("===========================================");
            System.out.println("Nhap lua chon cua ban:");
            choice = sc.nextInt();

            switch (choice) {
                case 'A':
                    System.out.println("So du tai khoan khach hang la: 1200000 vnd");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    System.out.println("===========================================");
                    break;
                case 'D':
                    System.out.println("Giao dich Nap tien");
                    System.out.println("Vui long nhap so tien muon nap: ");
                    double recharge = sc.nextDouble();
                    System.out.printf("Giao dich thanh cong. Ban vua nap <%.0f vnd> vao tai khoan",recharge);
            }
        }
    }
}
