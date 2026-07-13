package Sequencial;

import java.util.Scanner;

public class consumo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia percorrida: ");
        double distancia = sc.nextDouble();
        System.out.print("Combustívl gasto: ");
        double combustivel = sc.nextDouble();
        double consumoMedio = distancia/combustivel;
        System.out.printf("Consumo medio = %.3f ",consumoMedio);

    }
}
