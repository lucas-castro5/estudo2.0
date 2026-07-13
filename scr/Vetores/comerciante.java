package Vetores;

import java.util.Scanner;

public class comerciante {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double soma2 = 0;
        double calculo =0;
        System.out.print("Quantos numeros quer digitar? ");
        double N = sc.nextInt();
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        String[] nomes = new String[10];
        double[] precoCompra = new double[10];
        double[] precoVenda = new double[10];
        for (int i = 0; i < N; i++){
            System.out.printf("Produto %da ",i + 1);
            System.out.println();
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Preço compra: ");
            precoCompra[i] = sc.nextDouble();
            System.out.print("Preco venda: ");
            double num = sc.nextDouble();
            precoVenda[i] = num;
            System.out.println();

        }
        for (int i = 0; i < N; i++){
            soma += precoCompra[i];
            soma2 += precoVenda[i];
        }
        double lucroT = soma2 - soma;
        for (int i = 0; i < N; i++){
            double lucroPorcentagem =  precoVenda[i] - precoCompra[i] ;
            calculo = lucroPorcentagem/precoCompra[i] *100;
            if (calculo <10 && calculo > 0){
                count+=1;
            } else if (calculo<20) {
                count2 +=1;
            }else {
                count3 +=1;
            }
        }
        System.out.println("Relatorio: " );
        System.out.printf("Lucro abaixo de 10%%: %d",count);
        System.out.println();
        System.out.printf("Lucro entre 10%% e 20%%: %d",count2);
        System.out.println();
        System.out.printf("Lucro acima de 20%%: %d",count3);
        System.out.println();
        System.out.printf("Valor total de compra: %.2f",soma);
        System.out.println();
        System.out.printf("Valor total de venda: %.2f",soma2);
        System.out.println();
        System.out.printf("Lucro total: %.2f", lucroT);

    }
}
