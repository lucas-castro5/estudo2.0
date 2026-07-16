package Vetores;
import java.util.Scanner;
public class MaiorPosicao {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros quer digitar? ");
        int N = sc.nextInt();
        double[] vetor = new double[10];
        double num = 0;
        for (int i = 0; i < N; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0; i<N; i++){
            if (vetor[i]>num){
                num = vetor[i];
            }
        }
        System.out.println("Maior valor: " + num);
        System.out.print("Posição do maior valor = ");
        for (int i = 0; i < N; i++) {
            if (vetor[i]==num){
                System.out.println(i);
            }
        }
    }
}