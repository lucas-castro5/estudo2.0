package Matrizes;

import java.util.Scanner;

public class matrizGeral {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int maior = 0;

        System.out.print("Digite a ordem da matriz: ");
        int ordem = sc.nextInt();


        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.println("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }


        System.out.println("Soma dos positivos: ");


        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (matriz[i][j] > 0) {
                    maior += matriz[i][j];

                }
            }
        }
        System.out.println(maior);

        System.out.print("Escolha uma linha: ");
        int escolha = sc.nextInt();
        System.out.print("Linha escolhida: ");
        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[escolha][i] + " ");
        }
        System.out.println();


        System.out.print("Escolha uma coluna: ");
        int coluna = sc.nextInt();
        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[i][coluna] + " ");
        }
        System.out.println();


        System.out.println("Diagonal principal: ");
        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();


        System.out.println("Matriz alterada: ");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = matriz[i][j] * matriz[i][j];

                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
