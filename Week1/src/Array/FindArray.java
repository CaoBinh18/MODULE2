package Array;

import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        String students[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the name's student:");
        String name = sc.nextLine();
        boolean check  = false;
        for(int i = 0; i < students.length;i++){
            if(students[i].equals(name)){
                System.out.printf("Position ò the sudents in the list %s is %d",name,i+1);
                check = true;
                break;
            }


        }
        if(!check){
            System.out.printf("Not found %s in list",name);
        }
    }
}
