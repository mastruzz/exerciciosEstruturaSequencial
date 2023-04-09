package exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite todas as notas dos 4 bimestres: ");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        int nota4 = sc.nextInt();
        System.out.println("A média do aluno foi: "+ ((nota4+nota1+nota2+nota3)/4));
    }
}
