package Matrizes;

import java.util.Scanner;

public class negativoMatriz {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        System.out.print("Digite a qtd de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite a qtd de colunas: ");
        int coluna = sc.nextInt();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Elemento ["+i + "," + j +"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Valores negativos: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j]<0)
                    System.out.println(matriz[i][j] + " ");
            }

        }
    }
}
