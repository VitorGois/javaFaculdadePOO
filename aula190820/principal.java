package aula190820;

public class principal {
    
    public static void main(String[] args) {
        bolo b1 = null;
        bolo b2 = new bolo();
        bolo b3;

        b1 = new bolo();
        b3 = b1;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}