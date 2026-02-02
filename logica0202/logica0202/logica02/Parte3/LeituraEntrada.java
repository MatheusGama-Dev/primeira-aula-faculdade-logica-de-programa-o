import java.util.Scanner;

public class LeituraEntrada{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = input.nextLine();
    System.out.println("Olá," + nome);

    System.out.println("Digite sua idade");
    int idade = input.nextInt();
    System.out.println("Sua idade é "+ idade);
    


}

}