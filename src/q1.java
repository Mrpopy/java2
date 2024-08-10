import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int A = s.nextInt();
        System.out.print("digite o segundo numero: ");
        int B = s.nextInt();
        System.out.print("digite o terceiro numero: ");
        int C = s.nextInt();

        int AB = A+B;

        if ((AB) < C){
            System.out.printf("%d é menor que %d",AB,C);
        } else if ((AB) == C) {
            System.out.printf("%d é igual a %d",AB,C);
        } else {
            System.out.printf("%d é maior que %d",AB,C);
        }



    }
}