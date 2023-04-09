package exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = sc.nextInt();
        System.out.println("A soma é: "+ (numero2+numero1));
    }

}
