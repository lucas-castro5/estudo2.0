package Matrizes;

import java.util.Scanner;

public class somaLinhas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        double[] vetor = new double[5];

        System.out.print("Digite a qtd de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite a qtd de colunas: ");
        int coluna = sc.nextInt();


        for (int i = 0; i < linhas; i++) {
            System.out.printf("Digite os elementos da %da. linha: %n", i + 1);
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < linhas; i++) {
            vetor[i] = 0;
            for (int j = 0; j < coluna; j++) {
                vetor[i] += matriz[i][j];
            }

        }
        System.out.println("Vetor gerado: ");
        for (int i = 0; i < linhas; i++) {
            System.out.printf("%.2f%n", vetor[i]);
        }
    }
}
