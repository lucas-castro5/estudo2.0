package Sequencial;

import java.util.Scanner;

public class First {
    public static  void main(String[] args){
        double largura, comprimento, valorMetro, area, precoTerreno;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.print("digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.print("digite o valor do metro quadrado: ");
        valorMetro = sc.nextDouble();
        area = largura * comprimento;
        precoTerreno = area *valorMetro;
        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preço do terreno = R$ %.2f%n",precoTerreno);
    }
}
