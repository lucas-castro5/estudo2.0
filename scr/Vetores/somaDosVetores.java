package Vetores;

import java.util.Scanner;

public class somaDosVetores {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros quer digitar? ");
        int N = sc.nextInt();
        double[] vetor = new double[10];
        double[] vetor2 = new double[10];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < N; i++){
            vetor[i] = sc.nextDouble();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < N; i++){
            vetor2[i] = sc.nextDouble();
        }
        System.out.println("Vetor resultante: ");
        for (int i = 0; i<N; i++){
            System.out.println(vetor[i]+vetor2[i]);
        }
    }
}
