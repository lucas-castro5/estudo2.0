package Matrizes;

import java.util.Scanner;

public class acimaDiagonal {
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

        System.out.println("Soma dos elementos acima da diagonal principal: ");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (j > i){
                    maior += matriz[i][j];

                }
            }
        }
        System.out.println(maior);
    }
}
