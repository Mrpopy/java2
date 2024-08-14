import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digie um número: ");
        int num = n.nextInt();
        System.out.println("Digie um número: ");
        int num2 = n.nextInt();
        System.out.println("Digie um número: ");
        int num3 = n.nextInt();
        int maior=0, medio=0, menor=0;
        if ((num > num2) && (num > num3)){
            maior = num;
            if (num2 > num3){
                medio = num2;
                menor = num3;
            } else{
                medio = num3;
                menor = num2;
            }
        } else if ((num2 > num) && (num2 > num3)) {
            maior = num2;
            if (num > num3) {
                medio = num;
                menor = num3;
            } else {
                medio = num3;
                menor = num;
            }
        } else {
            maior = num3;
            if (num > num2) {
                medio = num;
                menor = num2;
            } else {
                medio = num2;
                menor = num;
            }
        }
        System.out.printf("O maior é %d o medio é %d e por ultimo é %d", maior, medio, menor);
    }
}
