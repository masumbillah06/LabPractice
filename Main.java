package Lab_26_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car c1 = new Car();
        Bike b1 = new Bike();
        Vehicle v1 = new Vehicle();

        v1.run(in.nextInt());
        c1.run(in.nextInt());
        b1.run(in.nextInt());
    }
}
