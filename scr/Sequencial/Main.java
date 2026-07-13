package Sequencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double b;
        String c;
        boolean d;
        System.out.println("Ola mundo!");
        a = sc.nextInt();
        b = sc.nextDouble();
        c = sc.next();
        d = false;
        System.out.println(" "+ a + b + c + d);


        sc.close();
    }
}