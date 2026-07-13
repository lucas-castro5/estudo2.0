package condicional;

import java.util.Scanner;

public class Cordenadas {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de X: ");
        double X = sc.nextDouble();
        System.out.print("Valor de Y: ");
        double Y = sc.nextDouble();
        if (X > 0 & Y > 0) {
            System.out.print("Q1");
        } else if (X < 0 & Y > 0) {
            System.out.print("Q2");
        } else if (X < 0 & Y < 0) {
            System.out.print("Q3");
        } else if (X > 0 & Y < 0) {
            System.out.print("Q4");
        } else if (X == 0) {
            System.out.print("Eixo Y");
        } else if (Y == 0) {
            System.out.print("Eixo X");
        } else {
            System.out.print("Origem");
        }

    }
}
