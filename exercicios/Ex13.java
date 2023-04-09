package exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        Double altura = sc.nextDouble();
        System.out.println("Digite seu sexo(M ou H): ");
        String sexo = sc.next();
       switch (sexo){
           case "H", "h":{
               Double peso = (72.7*altura) - 58;
               System.out.println("Digite peso ideal é: "+ peso);
               break;
           }
           case "M", "m":{
               Double peso = (62.1*altura) - 44.7;
               System.out.println("Digite peso ideal é: "+ peso);
               break;
           }
           default:{
               System.out.println("O sexo informado está inválido, por favor digite (M) ou (H);");
               break;
           }
       }
    }
}
