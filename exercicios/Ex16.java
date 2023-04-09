package exercicios;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        double calculo;
        int quantidadeTintas;
        System.out.println("Digite um valor em m²: ");
        double area = new Scanner(System.in).nextDouble();
        calculo = (area/3)/18;
        quantidadeTintas = (int) calculo;
        if ((area/3) % 18 != 0){
            quantidadeTintas = (int) ((area/3)/18 + 1);
        }
        String totalTintas = MessageFormat.format("Total de tintas compradas: {0}",quantidadeTintas);
        System.out.println(totalTintas);
        System.out.println("Valor total é R$" + new DecimalFormat("#.##").format(quantidadeTintas * 80.00));

    }
}
