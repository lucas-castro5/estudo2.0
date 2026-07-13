package Vetores;

import java.util.Scanner;

public class teste_vetor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros quer digitar? ");
        int N = sc.nextInt();
        double[] vetor = new double[10];
        for (int i = 0; i < N; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();

        }
        for (int i = 0; i<N; i++){
            System.out.println(vetor[i]);
        }
    }
}
