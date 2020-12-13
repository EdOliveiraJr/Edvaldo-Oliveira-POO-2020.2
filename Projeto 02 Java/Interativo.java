import java.util.Scanner;

public class Interativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end")){
                System.out.println("Gotcha!!");
                break;
            }
            else{
                System.out.println("FAIL!: Comando Invalido");
            }    
        }
        scanner.close();
    }
}
