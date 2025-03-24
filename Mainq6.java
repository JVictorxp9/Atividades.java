import java.util.Scanner;
public class Mainq6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a sua Matrícula: ");
        int Matricula = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o seu nome completo: ");
        String Nome = sc.nextLine();

        System.out.println("Informe seu salário bruto: ");
        double SalarioBruto = sc.nextDouble();

        double INSS = 0.0;

        INSS = SalarioBruto * 0.15;

        double salarioComDesconto = SalarioBruto - INSS;

        System.out.println("Matrícula: " + Matricula);
        System.out.println("Nome: " + Nome);
        System.out.println("Salario Bruto: " + SalarioBruto);
        System.out.println("Dedução do INSS: " + INSS);
        System.out.println("Salário Líquido: " + salarioComDesconto);

        sc.close();
    }
}
