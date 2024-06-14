package Repetição;

public class breakcontinue {
    public static void main(String[] args) {
        
        //CONTINUE PULA A INTERAÇÃO ATUAL
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                continue;

                System.out.println(numero);
        }

        //BREAK INTERROMPE TODA A EXECUÇÃO

        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                break;

                System.out.println(numero);
        }
    }
}
