package aula260820;

public class Teste2 {
     public static void main(String[] args) {
        
        Casa c1 = new Casa();
        Casa c2 = new Casa();
        Casa c3 = new Casa();

        c1.endereco = "Rua X, 99";
        c2.endereco = "Rua Y, 88";
        c3.endereco = "Rua Z, 43";

        c1.endereco = "Novo Endereco, 88";

        System.out.println(c1.endereco);
        System.out.println(c2.endereco);
        System.out.println(c3.endereco);

     }
}