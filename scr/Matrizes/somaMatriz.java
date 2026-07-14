package Matrizes;

import java.util.Scanner;

public class somaMatriz {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];
        int[][] matriz3 = new int[5][5];

        System.out.print("Digite a qtd de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite a qtd de colunas: ");
        int coluna = sc.nextInt();

        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Elemento [" + i + "," + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Elemento [" + i + "," + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }


        System.out.println("Matriz soma: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2 [i][j];
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
