package Condicionais;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "H";
        
        if(sigla == "P"){
            System.out.println("PEQUENO");
        }else if (sigla == "M") {
            System.out.println("MEDIO");
        } else if(sigla == "G") {
            System.out.println("GRANDE");
        } else {
            System.out.println("INDEFINIDO");
        }



    /*SWITCH CASE ABAIXO DA MESMA OPERACAO */
        String sigla1 = "P";
        switch (sigla1) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
        }
    }
}
