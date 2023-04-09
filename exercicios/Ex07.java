package exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        Double raio = sc.nextDouble();
        System.out.println("A area é: "+ Math.PI* (raio * raio));
        System.out.println("O dobro da area é: "+ (Math.PI* (raio * raio)*2));
    }
}
