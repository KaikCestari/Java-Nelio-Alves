import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resp;
        String nome;
        int diaria;
        int preco;
        int salario;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Olá, tudo bem? Hotel Talismã\n");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar funcionário");
            System.out.println("3 - Cadastrar produto");
            System.out.println("4 - Cadastrar serviço");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            resp = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha após o número

            switch (resp) {
                case 1:
                    System.out.println("\nCadastrar cliente");
                    System.out.print("Digite o nome do cliente: ");
                    nome = sc.nextLine();
                    System.out.print("Informe quantos dias você vai ficar: ");
                    diaria = sc.nextInt();

                    if (diaria > 1 && diaria <= 5) {
                        preco = 10 * diaria;
                        System.out.printf("Olá %s, sua conta ficou em %d reais.\n", nome, preco);
                    } else {
                        System.out.println("Número de dias inválido ou fora do intervalo permitido.");
                    }
                    break;

                case 2:
                    System.out.println("\nCadastrar funcionário");
                    System.out.print("Digite o nome do funcionário: ");
                    nome = sc.nextLine();
                    System.out.print("Informe o salário do funcionário: ");
                    salario = sc.nextInt();
                    System.out.printf("Funcionário %s cadastrado com salário de %d reais.\n", nome, salario);
                    break;

                case 3:
                    System.out.println("\nCadastrar produto");
                    // Lógica para cadastrar produto
                    break;

                case 4:
                    System.out.println("\nCadastrar serviço");
                    // Lógica para cadastrar serviço
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (resp != 0);

        sc.close();
        System.out.println("Programa encerrado.");
    }
}