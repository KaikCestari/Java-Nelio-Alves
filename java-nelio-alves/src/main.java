import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char resp;
        char nome;
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
            resp = sc.next().charAt(0);
            switch (resp) {
                case 1:
                    System.out.println("\nCadastrar cliente");
                    System.out.println("Digite o nome do cliente: ");
                    nome = sc.next().charAt(0);
                    System.out.println("Ok iremos cadastrar\n");
                    System.out.println("me informe quantos dias voce vai ficar");
                    diaria = sc.nextInt();
                    if (diaria >  1 || diaria < 5)
                    {
                        diaria = 10;
                        System.out.printf("Ola %s sua conta ficou em %d",nome,diaria);
                    }
                    break;
                    case 2:
                    System.out.println("\nCadastrar funcionário");
                    System.out.println("Digite o nome do funcionário: ");
                    nome = sc.next().charAt(0);
                    System.out.println("Ok iremos cadastrar\n");
                    System.out.println("me informe o salario do funcionario");
                    salario = sc.nextInt();
            
                
            }

            sc.close();

        } while (resp != '0');

        
        System.out.println("Programa encerrado.");
    }
}