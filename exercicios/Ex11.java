package exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int int1 = sc.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int int2 = sc.nextInt();
        System.out.println("Digite o numero real: ");
        Double real = sc.nextDouble();
        System.out.println("o produto do dobro do primeiro com metade do segundo: " + (int1*2)+(int2/2));
        System.out.println("a soma do triplo do primeiro com o terceiro: " + (int1*3)+(real));
        System.out.println("o terceiro elevado ao cubo: " + Math.pow(real, 3));


    }
}
