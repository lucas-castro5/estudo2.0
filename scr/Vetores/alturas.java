package Vetores;

import java.util.Scanner;

public class alturas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        System.out.print("Quantos numeros quer digitar? ");
        double N = sc.nextInt();
        int count = 0;
        double[] altura = new double[10];
        String[] nomes = new String[10];
        double[] idade = new double[10];
        for (int i = 0; i < N; i++){
            System.out.printf("Dados da %da Pessoa",i + 1);
            System.out.println();
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextDouble();
            System.out.print("Altura: ");
            double num = sc.nextDouble();
            altura[i] = num;
            System.out.println();
            soma += altura[i];
        }
        System.out.print("Relatorio ");

        for (int i = 0; i<N; i++){
            if (idade[i] < 16){
                count +=1;
            }
        }
        double media = soma/N ;
        System.out.printf("Altura média: %.2f",media);
        System.out.println();
        double menorDezesseis =count/N * 100;
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% ",menorDezesseis);
        System.out.println();
        for (int i = 0; i<N; i++){
            if (idade[i] < 16){
                System.out.println(nomes[i]);
            }
        }
    }
}
