package Repetitivas;

import java.util.Scanner;

public class tabuada {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.print("Deseja a tabuada para qual valor? ");
        int num = sc.nextInt();
        for (int i = 0; i<10 + 1 ; i++){
            result = num * i;
            System.out.printf("%d X %d = %d",num,i,result);
            System.out.println();
        }
    }
}
