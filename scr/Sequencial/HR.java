package Sequencial;

import java.util.Scanner;

public class HR {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a duração em segundos: ");
        double segundosT = sc.nextDouble();
        double segundos = segundosT%60;
        double minutosT = segundosT/60;
        double minutos = minutosT%60;
        double horas = minutosT/60;
        System.out.printf("as horas são %.0fH e %.0fM %.0fS",horas,minutos,segundos);

    }
}
