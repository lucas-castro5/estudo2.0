package Vetores;

import java.util.Scanner;

public class negativos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros quer digitar? ");
        int N = sc.nextInt();
        double[] vetor = new double[10];
        for (int i = 0; i < N; i++){
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            vetor[i] = num;

        }
        System.out.println("Numeros negativos: ");
        for (int i = 0; i<N; i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
        }
    }
}}

