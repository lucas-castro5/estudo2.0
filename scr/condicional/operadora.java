package condicional;

import java.util.Scanner;

public class operadora {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        if (minutos>100){
            double valor = ((minutos - 100) *2) + 50;
            System.out.printf("Valor a pagar: R$ %.2f",valor);
        } else {
            System.out.println("Valor a pagar: R$ 50,00");
        }
    }
}
