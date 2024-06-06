package Condicionais;

// Condicional composta.
// Encadeadas = vários elses
public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 3;
        double media = 7;

        if(nota >= media){
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovado");
        }

        System.out.println("Nota: " + nota);

        //Condição ternária
        //String resultado = nota >=7 ? "Aprovado" : "Reprovado";
    }
}
