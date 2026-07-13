package condicional;

import java.util.Scanner;

public class lanchonete {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int codigo1 = 1;
        int codigo2 = 2;
        int codigo3 = 3;
        int codigo4 = 4;
        int codigo5 = 5;
        double preco1 = 5.00;
        double preco2 = 3.50;
        double preco3 = 4.80;
        double preco4 = 8.90;
        double preco5 = 7.32;
        System.out.print("Codigo do produto comprado: ");
        int codigoC = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        int qtd = sc.nextInt();
        double pagar = 0;
        switch (codigoC) {
            case 1:
                pagar = qtd * preco1;
                System.out.printf("Valor a pagar: R$ %.2f", pagar);
                break;
            case 2:
                pagar = qtd * preco2;
                System.out.printf("Valor a pagar: R$ %.2f", pagar);
                break;
            case 3:
                pagar = qtd * preco3;
                System.out.printf("Valor a pagar: R$ %.2f", pagar);
                break;
            case 4:
                pagar = qtd * preco4;
                System.out.printf("Valor a pagar: R$ %.2f", pagar);
                break;
            case 5:
                pagar = qtd * preco5;
                System.out.printf("Valor a pagar: R$ %.2f", pagar);
                break;
        }
    }
}
