package Repetitivas;

import java.util.Scanner;

public class senha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = -1;
        System.out.print("Digite a senha: ");
        while (senha != 0){
            senha = sc.nextInt();
            if (senha != 2002){
                System.out.print("SENHE INVALIDA!");
            } else {
                System.out.print("Acesso permitido!");
                break;
            }
            System.out.print(" Tente novamente: ");
        }
    }
}
