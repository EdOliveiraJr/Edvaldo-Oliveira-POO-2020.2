import java.util.Scanner;
import java.util.Arrays;

public class Solver {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite vários inteiros em linha ou -1 para sair:");
        
        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
        scanner.close();*/

        //int cont = 0;

        /*while(true){
            int a  = scanner.nextInt();
            if(a==-1) break;
            else cont += a;
        }
        scanner.close();
        System.out.println(cont);
        */

        /*while(true){
            int a = scanner.nextInt();
            int a = scanner.nextInt();
            String c = scanner.next();
            String line = scanner.nextLine();

            if(a == -1) break;
        }*/

        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        int qtd = tokens.length;
        System.out.println("Voce digitou " + qtd + " elementos");
        
        System.out.print("[ ");
        for(int i = 0; i < tokens.length; i ++)
            System.out.print(tokens[i] + " ");
        System.out.println("]");
        
        System.out.println(Arrays.asList(tokens));
        scanner.close();

        int acc = 0;
        for(int i = 0; i < tokens.length; i++)
            acc += Integer.parseInt(tokens[i]);
        System.out.println("A soma deu " + acc);

    }

}