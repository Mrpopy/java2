import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double p = n.nextDouble();
        System.out.println("Digite a altura: ");
        double a = n.nextDouble();
        double IMC = p/(a*a);
        if (IMC < 18.5){
            System.out.println("Abaixo do peso.");
        } else if (IMC > 18.5 && IMC < 25) {
            System.out.printf("Peso normal.");
        } else if (IMC > 25 && IMC < 30) {
            System.out.println("Acima do peso.");
        }
        else{
            System.out.println("Obeso.");
        }
    }
}
