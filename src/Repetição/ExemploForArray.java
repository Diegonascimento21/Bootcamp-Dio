package Repetição;

public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos [] = {"Diego", "Ana", "Tereza", "Adelson"};

        for (int x=0; x < alunos.length; x++){
            
            System.out.println("Aluno do indice " + x + " " + alunos[x]);
            
        }

        //FORMA ABREVIADA:

        for(String aluno : alunos){

            System.out.println("Nome do aluno é = " + aluno);

        }
    }
}
