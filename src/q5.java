import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = s.nextInt();
        if (numero > 0){
            System.out.print(numero * 2);
        }
        else {
            System.out.print(numero * 3);
        }

    }
}
