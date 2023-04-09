package exercicios;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tamanho;
        System.out.println("Digite o tamanho do arquivo a ser baixado (em MB): ");
        tamanho = input.nextDouble();
        double conexao;
        System.out.println("Digite a velocidade de download da internet em Mbps:");
        conexao = input.nextDouble();
        double minutos;
        minutos = Math.ceil(tamanho*8)/(conexao*60);
        System.out.println("O tempo aproximado de download do arquivo informado usando esta rede é de "+ minutos + " minutos");
    }}
