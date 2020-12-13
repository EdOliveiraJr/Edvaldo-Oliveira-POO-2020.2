import java.util.Scanner;

public class Cururu2{
    int bucho;
    int maxBucho;
    int agua;
    int maxAgua;

    Cururu2(int bucho, int maxBucho, int agua, int maxAgua){
        this.bucho = bucho;
        this.maxBucho = maxBucho;
        this.agua = agua;
        this.maxAgua = maxAgua;
    }

    void comer(){
        if(bucho < maxBucho){
            bucho +=1;
            System.out.println("\nSlp!! Glump!! Aaah!! Delicius!!\n");
        }else{
            System.out.println("\nNan manchuuu!! Tô espocando!!! 0.o\n");
          }
    }

    void pular(){
        if(agua > 0 && bucho > 0){
            bucho -= 1;
            agua  -= 1;
            System.out.println("\nLá vou eu!! Jump!!\n");
        }else if(agua <= 0){
            System.out.println("\nOh Sede!! Vou nada!!\n");
        }else if(bucho <= 0){
            System.out.println("\nOh Fome!! Vou não!!\n");
        }
    }

    void hidratar(){
        if(agua < maxAgua){
            agua += 1;
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
        System.out.println("\nOlá meu nome é cururu João!\n\nPara saber como podemos brincar digite: ajuda\n\n"); 
    }

    void ajuda(){
        System.out.println("\nPara mostrar o estado do João digite: show.\nPara hidradar o João digite: beber.\nPara alimentar João digite: comer.\nPara João passear digite: pular.\nPara João tomar um sol digite: solzinho.\nPara sair do aplicação digite: end.\n\nDIVIRTA-SE!!\n\n");
    }

    public String toString(){
    return "\nBucho: " + bucho + "/" + maxBucho + " Nível de água: " + agua + "/" + maxAgua + "\n";
    }
    
    public static void main(String[] args) {
        Cururu2 joao = new Cururu2(0, 5, 0, 5);
        
        Scanner scanner = new Scanner(System.in);

        joao.menu();
        
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end")){
                System.out.println("\n¡Adios amigo!\n");
                break;
            }else if(line.equals("ajuda")){
                joao.ajuda();
            }else if(line.equals("show")){
                System.out.println(joao);
            }else if(line.equals("comer")){
                joao.comer();
            }else if(line.equals("pular")){
                joao.pular();
            }else if(line.equals("beber")){
                joao.hidratar();
            }else if(line.equals("solzinho") ){
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

