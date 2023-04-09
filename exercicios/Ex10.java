package exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os graus em celsius: ");
        Double C = sc.nextDouble();
        Double F = C*1.8 +32;
        System.out.println("Os graus Fahrenheit são: "+ F);
    }
}
