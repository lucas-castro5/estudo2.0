package Matrizes;

import java.util.Scanner;

public class diagonalNegativos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int count = 0;


        System.out.print("Digite a ordem da matriz: ");
        int ordem = sc.nextInt();


        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.println("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }


        System.out.println("Diagonal principal: ");
        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[i][i] + " ");
        }


        System.out.println();


        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (matriz[i][j] < 0) {
                    count += 1;
                }
            }

        }
        System.out.println("Quantidade de negativos = " + count);
    }
}
