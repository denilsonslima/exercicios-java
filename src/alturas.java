import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];

        for (int i =0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double res = 0;
        int person = 0;
        for(int i =0; i < n; i++){
            res += altura[i];
            if(idades[i] < 16){
                person++;
            }
        }

        String[] names = new String[person];
        for (int i =0; i < n; i++){
            if(idades[i] < 16){
                names[i] = name[i];
            }
        }

        System.out.printf("Altura média: %.2f%%\n", res/n);
        System.out.println("Pessoas com menos de 16 anos: " + (person * 100/n) + "%");

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
}
