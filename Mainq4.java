import java.util.Scanner;

public class Mainq4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double desconto = 0.0;

        if (salario <= 900.00) {
            System.out.println("Isento de IR");

        }
        else if (salario <= 1500.00) {
            desconto = salario * 0.05;
            System.out.println("Desconto de 5%: R$ " + desconto);
        }
        else if (salario <= 2500.00) {
            desconto = salario * 0.10;
            System.out.println("Desconto de 10%: R$ " + desconto);
        }
        else {
            desconto = salario * 0.20;
            System.out.println("Desconto de 20%: R$ " + desconto);
    }
        double salarioComDesconto = salario - desconto;
        System.out.println("Salário líquido após desconto é de: R$ " + salarioComDesconto);

        sc.close();
 }
}
