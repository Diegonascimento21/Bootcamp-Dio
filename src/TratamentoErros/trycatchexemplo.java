package TratamentoErros;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class trycatchexemplo {
   
    public static void main(String[] args) {
         
        try{       //TRY

        //Criando o Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();

        //  Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo: " + nome);
        System.out.println("Meu sobrenome é: " + sobrenome);
        System.out.println("Minha idade é: " + idade);


        }catch (InputMismatchException e){   //CATCH
            System.out.println("O campo idade precisa ser numérico, tente novamente.");
        }
    

    }
}
