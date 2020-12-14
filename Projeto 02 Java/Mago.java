import java.util.Scanner;

public class Mago {
    String nome;
    int energia;
    int saude;
    boolean cajado;

    Mago(String nome, int energia, int saude){
        this.nome = nome;
        this.energia = energia;
        this.saude = saude;
    }
    public java.lang.String toString() {
        return "Nome: " + this.nome + " || Energia: " + this.energia + " || Saude: " + this.saude;
    }

    public static void main(String[] arg) {
        Mago mago = new Mago("Jonh Doe", 10, 10);
    
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                System.out.print("Fechate Cesamo!!");
                break;
            }else if(ui[0].equals("init")){
                mago = new Mago(ui[1], Integer.parseInt(ui[2]), Integer.parseInt(ui[3]));
            }else if(ui[0].equals("show")){
                System.out.println(mago);        
            }else{
                System.out.println("Comando Inválido!!");
            }
        }
        scanner.close();
    }
    

}

