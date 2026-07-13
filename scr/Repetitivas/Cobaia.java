package Repetitivas;

import java.util.Scanner;

public class Cobaia {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos casos de teste serao digitados? ");
        int num = sc.nextInt();
        double CobaiaC = 0;
        double CobaiaR = 0;
        double CobaiaS = 0;
        int count = 0;
        for (int i = num ; i>0 ; i--){
            System.out.print("Quantidade de cobaias: ");
            int qtdC = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            String tipoCobaia = sc.next();
            count +=qtdC;
            if (tipoCobaia.equals("C")) {
                CobaiaC +=qtdC;
            } else if (tipoCobaia.equals("R")) {
                CobaiaR +=qtdC;
            } else if (tipoCobaia.equals("S")) {
                CobaiaS +=qtdC;
            } else {
                System.out.print("Tipo de cobaia invalido");
            }

        }
        double percentualC = CobaiaC/count *100;
        double percentualR = CobaiaR/count *100;
        double percentualS = CobaiaS/count *100;

        System.out.println("RELATORIO FINAL: ");
        System.out.println("Total:  " + count  );
        System.out.println("Total de coelhos:  " + CobaiaC  );
        System.out.println("Total de ratos:  " + CobaiaR  );
        System.out.println("Total de Sapos:  " + CobaiaS  );
        System.out.println("Percentual de coelhos:  " + percentualC );
        System.out.println("Percentual de ratos:  " + percentualR );
        System.out.println("Percentual de sapos:  " + percentualS );


    }
}
