package exercicios;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a área em m² a ser pintada ");
        double area;
        area = input.nextDouble();
        double litros;
        litros = area/6;
        double latas;
        latas = Math.ceil(litros/18.0);
        double preco;
        preco = latas* 80;
        double galao;
        galao  = Math.ceil(litros/3.6);
        double valorgalao;
        valorgalao = galao * 25;
        double misturaLatas;
        misturaLatas = Math.ceil(litros/18);
        double misturaGaloes;
        misturaGaloes = Math.ceil(litros-misturaLatas*18)/ 3.6;

        if(litros- (misturaLatas*18)%3.6!=0); {
            misturaGaloes += 1;
        }
        double valormix = Math.ceil(misturaLatas*80)+(misturaGaloes*25);
        System.out.println("serão necessarias "+ latas+" latas de tinta dando um total de R$"+preco);
        System.out.println("Para utilizar latas de 18 litros vai precisar de: "+latas
                +" lata(s) que vão custar: R$"+preco+"");
        System.out.println("Para utilizar galões de 3.6 litros vai precisar de: "+galao
                +" galão(ões) que vão custar: R$"+valorgalao+"");
        System.out.println("Caso deseje mesclar entre  latas e galões para melhor aproveitamento, sera necessario: " +misturaLatas
                + " lata(s) e "+ misturaGaloes +" galão(ões) e vão custar R$"+ valormix+"");

    }
    }

