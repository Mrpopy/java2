import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua alura: ");
        double h = s.nextDouble();
        System.out.println("Digite seu sexo: ");
        String sx = s.next();

        if(sx.equalsIgnoreCase("feminino")){
            System.out.println((62.1 * h)-44.7);
        }
        else if (sx.equalsIgnoreCase("masculino")) {
            System.out.println((72.7 * h)-58);
        }
        else{
            System.out.println("Sexo inválido, digite apenas masculino ou feminino. ");
        }
    }
}
