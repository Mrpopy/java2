import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int nu = n.nextInt();
        if (nu%2 == 0){
            System.out.println(nu + 5);
        }
        else
            System.out.println(nu + 8);
    }
}
