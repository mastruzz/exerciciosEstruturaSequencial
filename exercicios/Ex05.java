package exercicios;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em métros: ");

        Double metros = sc.nextDouble();
        System.out.println("O valor em centimetros é: " + metros * 100);
    }

}
