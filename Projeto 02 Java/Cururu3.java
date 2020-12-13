import java.util.Scanner;

public class Cururu3{
    int bucho;
    int maxBucho;
    int agua;
    int maxAgua;
    //int qtd;
    //int dist;

    Cururu3(int bucho, int maxBucho, int agua, int maxAgua){
        this.bucho = bucho;
        this.maxBucho = maxBucho;
        this.agua = agua;
        this.maxAgua = maxAgua;
    }

    void comer(int qtd){
        if(bucho < maxBucho){
            bucho += qtd;
            System.out.println("\nSlp!! Glump!! Aaah!! Delicius!!\n");
        }else{
            System.out.println("\nNan manchuuu!! Tô espocando!!! 0.o\n");
          }
    }

    void pular(int dist){
        if(agua > 0 && bucho > 0){
            bucho -= dist;
            agua  -= dist;
            System.out.println("\nLá vou eu!! Jump!!\n");
        }else if(agua <= 0){
            System.out.println("\nOh Sede!! Vou nada!!\n");
        }else if(bucho <= 0){
            System.out.println("\nOh Fome!! Vou não!!\n");
        }
    }

    void hidratar(int qtd){
        if(agua < maxAgua){
            agua += qtd;
            System.out.println("\nHumm!! Agua!!\n");
        }else{
            System.out.println("\nDxaqueto!! Já tô molhadinho!!\n");
        }
    }

    void pegarSol(){
        if(agua > 0 && bucho > 0){
            agua -=1;
            bucho -=1; 
            System.out.println("\nSolzinho gostoso!! Impressão minha ou estou ficando com a pele ressecada??\n");
        }else if(agua <= 0){
            System.out.println("\nC tá doiiidooo!! Carlor dos seissentos!! Quero água!!\n");
        }else if(bucho <= 0){
            System.out.println("\nOh Fome!! Vou não!!\n");
        }
    }

    void menu(){
        System.out.println("\nOlá meu nome é cururu João!\n\nPara saber como podemos brincar digite: ajuda\n"); 
    }

    void ajuda(){
        System.out.println("\nPara mostrar o estado do João digite: show.\nPara hidradar o João digite: beber.\nPara alimentar João digite: comer.\nPara João passear digite: pular.\nPara João tomar um sol digite: solzinho.\nPara sair do aplicação digite: end.\n\nDIVIRTA-SE!!\n\n");
    }

    public String toString(){
    return "\nBucho: " + bucho + "/" + maxBucho + " || Nível de Água: " + agua + "/" + maxAgua + "\n";
    }
    
    public static void main(String[] args) {
        Cururu3 joao = new Cururu3(0, 10, 0, 10);
        
        Scanner scanner = new Scanner(System.in);

        joao.menu();
        
        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(line.equals("end")){
                System.out.println("\n¡Adios amigo!\n");
                break;
            }else if(line.equals("ajuda")){
                joao.ajuda();
            }else if(line.equals("show")){
                System.out.println(joao);
            }else if(ui[0].equals("comer")){
                joao.comer(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("pular")){
                joao.pular(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("beber")){
                joao.hidratar(Integer.parseInt(ui[1]));
            }else if(line.equals("solzinho")){
                joao.pegarSol();
            }else{
                System.out.println("\nFAIL!!! EOQ MAN?!\n");
            }
        }
        scanner.close();             
    }
}

/*COMENTADOS
sapao.comer();
    sapao.pular();
    sapao.pegarSol();
    sapao.hidratar();

    //referência = criando objeto
    Cururu sapao = new Cururu(0, 10, 0, 10);
    System.out.println(sapao);
    sapao.pegarSol();
    sapao.pular();
    sapao.hidratar();sapao.hidratar();sapao.hidratar();sapao.hidratar();
    sapao.comer();sapao.comer();sapao.comer();sapao.comer();sapao.comer();
    System.out.println(sapao);
    
    
*/

