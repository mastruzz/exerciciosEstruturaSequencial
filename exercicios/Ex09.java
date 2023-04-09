package exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os graus em Fahrenheit: ");
        Double F = sc.nextDouble();
        Double C = 5 * ((F-32) / 9);
        System.out.println("Os graus celsius são: "+ C);
    }
}
