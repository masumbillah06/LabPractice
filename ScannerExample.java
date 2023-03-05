package Lab_26_02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        name = input.nextLine();
        System.out.println("Name is : "+name);
    }
}
