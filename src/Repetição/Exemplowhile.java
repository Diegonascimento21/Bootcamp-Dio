package Repetição;

public class Exemplowhile {
    public static void main(String[] args) {
        
        //(ENQUANTO) WHILE TESTA A CONDIÇÃO ANTES DE EXECUTAR

        double mesada = 50.0;

        while(mesada > 0){
            double valorDoce = 5.7;

            if (valorDoce < mesada) {
                mesada = mesada - valorDoce;
                System.out.println("Doce do valor " + valorDoce + " adicionado");
                
            }

            System.out.println("Mesada no valor atual: " + mesada);
            break;
            
        }


   
    }
}
