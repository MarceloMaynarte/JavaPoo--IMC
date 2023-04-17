import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        // Pedindo entrada de dados ao usuário;

        System.out.println("Informe o seu nome. ");
        String nome = input.nextLine();

        System.out.println("Informe o seu sobrenome. ");
        String sobrenome = input.nextLine();

        System.out.println("Informe a sua idade. ");
        int idade = input.nextInt();

        System.out.println("Informe o seu peso. ");
        double peso = input.nextDouble();

        System.out.println("Informe a sua altura. ");
        double altura = input.nextDouble();
    
    Pessoa pessoa  = new Pessoa( nome, sobrenome, idade, altura, peso);
    System.out.printf("o IMC é de" + pessoa.getNome(), pessoa.getSobrenome(), pessoa.getPeso(), pessoa.getAltura(), pessoa.getIMC());
    pessoa.InformaObesidade();

    }
}
