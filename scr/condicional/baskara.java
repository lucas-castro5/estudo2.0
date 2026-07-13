package condicional;

import java.util.Scanner;

public class baskara {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coeficiente A: ");
        double coeficienteA = sc.nextDouble();
        System.out.print("Coeficiente B: ");
        double coeficienteB = sc.nextDouble();
        System.out.print("Coeficiente C: ");
        double coeficienteC = sc.nextDouble();
        double delta = Math.pow(coeficienteB,2) - (4* coeficienteA * coeficienteC);
        double x1 = (-coeficienteB + Math.sqrt(delta)) / (2*coeficienteA);
        double x2 = (-coeficienteB - Math.sqrt(delta)) / (2*coeficienteA);
        if (delta >= 0){
            System.out.printf("X1 = %.4f", x1);
            System.out.println();
            System.out.printf("X2 = %.4f",x2);
        } else {
            System.out.print("Esta equação nao possui raizes reais");
        }
    }

}
