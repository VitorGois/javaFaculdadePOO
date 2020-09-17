package aula260820;

public class Teste4 {
    
public static void main(String[] args) {
    
        Casa c1, c2, c3;
        

        c1 = new Casa();
        c1.endereco = "A";
        c1.quantComodos = 10;
        c1.valor = 1000;


        c2 = new Casa();
        c2.endereco = c1.endereco;
        c3 = c1;
        c3.endereco = "C";
        c3 = new Casa();
        c3.endereco = c2.endereco;
        c1 = new Casa();

        System.out.println(c1.endereco);
        System.out.println(c2.endereco);
        System.out.println(c3.endereco);



    }
}