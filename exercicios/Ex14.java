package exercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Quantos quilos trouxe dessa vez?: ");
        int quilos = sc.nextInt();

      Double excesso = quilos - 50.00;
      if (excesso > 0 ){
          System.out.println("O Excesso é: " + excesso);
      }

      Double valorMulta = excesso * 4.00;
        if (valorMulta>= 4.00){
            System.out.println("O Valor da multa é: " + Math.ceil(valorMulta));
        }else{
            System.out.println("Não tem multa dessa vez ;)");

        }

    }
}
