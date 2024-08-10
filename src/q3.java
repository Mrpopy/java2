import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = s.nextInt();
        if (numero % 2 == 1){
            System.out.println("ìmpar");
        }
        else {
            System.out.println("Par");
        }

    }
}
