package Vetores;

import java.util.Scanner;

public class somaVetor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        System.out.print("Quantos numeros quer digitar? ");
        int N = sc.nextInt();
        double[] vetor = new double[10];
        for (int i = 0; i < N; i++){
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            vetor[i] = num;

        }
        System.out.print("Valores = ");
        for (int i = 0; i<N; i++){
            System.out.print(" " + vetor[i] + " ");
            soma+=vetor[i];
        }
        double media = soma/N;
        System.out.println();
        System.out.printf("A soma é: %.2f",soma);
        System.out.println();
        System.out.printf("A média é: %.2f",media);
    }
}
