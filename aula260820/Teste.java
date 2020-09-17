package aula260820;

public class Teste {

    public static void main(String[] args) {
        Casa c1 = new Casa();
        Casa c2 = null;

        System.out.println(c1);
        System.out.println(c1.endereco);
        System.out.println(c1.quantComodos);

        c1.endereco = "Rua X, 99";
        c1.quantComodos = 4;

        System.out.println(c1.endereco);
        System.out.println(c1.quantComodos);

        System.out.println(c2);
    }
    
}