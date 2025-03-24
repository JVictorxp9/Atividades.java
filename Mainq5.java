import java.util.Scanner;

public class mainq5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta;
        do {

            System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

            System.out.println("Deseja fazer um novo cadastro? (S/N)");
            resposta = sc.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Encerrando... Obrigado!");

        sc.close();

    }
}
