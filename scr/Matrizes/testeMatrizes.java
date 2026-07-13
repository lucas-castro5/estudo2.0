package Matrizes;

import java.util.Scanner;

public class testeMatrizes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int linhas = sc.nextInt();
        int coluna = sc.nextInt();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Elemento ["+i + "," + j +"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
