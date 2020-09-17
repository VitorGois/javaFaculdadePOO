package aula260820;

public class Teste3 {
    public static void main(String[] args) {
        
        Casa c1, c2, c3;

        c1 = new Casa();
        c1.endereco = "X";
        c2 = c1;
        c1 = new Casa();
        c1.endereco = "Y";
        c3 = c1;
        c1 = new Casa();
        c1.endereco = "Z";

        System.out.println(c1.endereco);
        System.out.println(c2.endereco);
        System.out.println(c3.endereco);
        

    }
}