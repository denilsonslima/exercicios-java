import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = sc.nextInt();
        }

        System.out.print("VALORES: ");

        int sum = 0;
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
            sum += num[i];
        }

        System.out.println();
        System.out.println("SOMA " + sum);
        System.out.println("MEDIA " + (double) sum/num.length);

        sc.close();
    }
}

