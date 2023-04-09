package exercicios;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto ganha por hora: ");
        Double hora = sc.nextDouble();
        System.out.println("Digite quantas horas trabalha por mês: ");
        double horasMes = sc.nextDouble();
        double bruto = hora * horasMes;
        double inss = porcentagem(8, bruto);
        double ir = porcentagem(11, bruto);
        double sindicato = porcentagem(5, bruto);
        double liquido = bruto - (inss + ir + sindicato);
        System.out.println("Salario Bruto: "+ bruto);
        System.out.println("IR (11%) : R$ "+ ir);
        System.out.println("INSS (8%) : R$ "+ inss);
        System.out.println("Sindicato ( 5%) : R$ "+ sindicato);
        System.out.println("Salário Liquido : R$ "+ liquido);

    }


    static Double porcentagem(double porcentagem, double total){
        return total/100 * porcentagem;
    }
}
