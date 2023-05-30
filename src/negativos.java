import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for(int i = 0; i < num.length; i++){
            if(num[i] < 0){
                System.out.println(num[i]);
            }
        }

        sc.close();
    }
}

