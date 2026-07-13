package Sequencial;

import java.util.Scanner;

public class idades {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.next();
        System.out.print("Idade: ");
        double idade1 = sc.nextDouble();
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        String nome2 = sc.next();
        System.out.print("Idade: ");
        double idade2 = sc.nextDouble();
        double media = (idade1+idade2) / 2;
        System.out.printf("A idade média de %s e %s é de %.1f anos",nome1,nome2,media);

    }
}
