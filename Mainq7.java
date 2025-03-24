import java.util.Scanner;

public class Mainq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaNotas = 0;
        int totalNotas = 0;
        String repetir;

        System.out.println("Bem-vindo ao calculador de média do aluno!");

        do {
            System.out.println("Insira uma nota do aluno: ");
            double nota = sc.nextDouble();

            somaNotas += nota;
            totalNotas++;

            System.out.print("Deseja inserir outra nota? (Digite 'S' ou 'N'): ");
            repetir = sc.next();

        } while (repetir.equalsIgnoreCase("S"));

        if (totalNotas > 0) {
            double media = somaNotas / totalNotas;
            System.out.printf("Média das Notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        System.out.println("Obrigado por usar o programa!");
        sc.close();
    }
}
