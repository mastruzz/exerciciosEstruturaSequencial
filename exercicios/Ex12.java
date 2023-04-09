package exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        Double altura = sc.nextDouble();
        Double peso = (72.7*altura) - 58;
        System.out.println("O peso ideal é: " + peso);
    }
}
