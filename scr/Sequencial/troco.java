package Sequencial;

import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int qtd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double qtdPaga = sc.nextDouble();
        double trocos = qtdPaga -  (qtd * preco) ;
        if (qtdPaga > qtd * preco){
            System.out.printf("TROCO = R$ %.1f ",trocos);
        } else {
            System.out.print("Você é pobre sai daq");
        }

    }

}
