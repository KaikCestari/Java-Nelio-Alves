import java.util.Scanner;
public class main
{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        float media;
        String nome;
System.out.println("Digite o nome do aluno");
nome = sc.nextLine();
    System.out.println("Digite a primeira nota");
    n1 = sc.nextInt();
    System.out.println("Digite a segunda nota");
    n2 = sc.nextInt();
    media = (n1 + n2) / 2;
   if (media>7) {
    System.out.printf("Parabens %s voce foia aprovado com a media %.2f",nome,media);
   }
   else if (media <8) {
System.out.printf(" %s voce foi reprovado",nome,media);
   }

    sc.close();
    
   
    }
}
