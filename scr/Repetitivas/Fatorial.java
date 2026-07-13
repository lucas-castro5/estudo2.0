package Repetitivas;

import java.util.Scanner;

public class Fatorial {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fatorial = 1;
        for (int i = num ; i>1 ; i--){
            fatorial *= i;


        }
        System.out.println("result " + fatorial);
    }
}
