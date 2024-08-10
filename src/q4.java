import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um numero para a letra A: ");
        int A = n.nextInt();
        System.out.println("Digite um numero para a letra B: ");
        int B = n.nextInt();
        if (A == B){
            System.out.println(A + B);
        }
        else{
            System.out.println(A*B);
        }
    }
}
