import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("digite o seu nome: ");
        String nome = s.nextLine();
        System.out.print("digite o seu sexo: ");
        String sexo = s.nextLine();
        System.out.print("digite o seu estado civil: ");
        String estadoCiv = s.nextLine();
        estadoCiv = estadoCiv.toLowerCase();
        sexo = sexo.toLowerCase();

        if (sexo.equals("f") || sexo.equals("feminino") && estadoCiv.equals("casada")){
            System.out.print("você e casada a quantos anos?");
            int anos = s.nextInt();
            System.out.print("você registrou seus anos de casado");
            System.out.print(anos);
        }
        else {
            System.out.printf("registrado");
        }



    }
}
