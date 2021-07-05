package IOTextFile.ReadFileExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nhập đường dẫn file: ");
//        String path = scanner.nextLine();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("3");
        arr.add("5");
        arr.add("7");
        arr.add("1");

        WriteFileExample writeFile = new WriteFileExample();
        writeFile.writeFileText("src\\IOTextFile\\ReadFileExample\\File.txt", arr);

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText("src\\IOTextFile\\ReadFileExample\\File.txt");
    }
}
