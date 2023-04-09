package exercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto ganha por hora: ");
        Double hora = sc.nextDouble();
        System.out.println("Digite quantas horas trabalha por mês: ");
        double horasMes = sc.nextDouble();
        System.out.println("no mês voce ganha: "+ hora * horasMes);
    }
}
