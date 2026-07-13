package Repetitivas;

import java.util.Scanner;

public class media_idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0;
        double MediaF = 0;
        int idade2 = 0;
        int sla = 0;
        System.out.print("Digite as idades: ");
        while (true) {

            count += 1;
            int idade = sc.nextInt();
            if ( idade >0){
                idade2 +=idade;
                MediaF = idade2/count;
            } else {
                if (count == 1 & idade<=0) {
                    System.out.print("IMPOSSIVEL CALCULAR");
                    break;
                } else if (idade <=0) {
                    System.out.printf("MEDIA = %.2f", MediaF);
                    break;
                }
            }


        }
    }
}

