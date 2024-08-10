import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("escreva True ou false pro primeiro valor");
        boolean b1 = s.nextBoolean();
        System.out.println("escreva True ou false pro segundo valor");
        boolean b2 = s.nextBoolean();

        if (b1 == true && b2 == true) {
            System.out.println("ambos são verdadeiros");

        } else if (b1 == true && b2 == false) {
            System.out.println("são diferentes");
        }
        else if (b1 == false && b2 == true) {
            System.out.println("são diferentes");
        }
        else {
            System.out.println("ambos são falsos");
        }

    }
}