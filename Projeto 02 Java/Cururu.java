
public class Cururu{
    int bucho;
    int maxBucho;
    int agua;
    int maxAgua;

    Cururu(int bucho, int maxBucho, int agua, int maxAgua){
        this.bucho = bucho;
        this.maxBucho = maxBucho;
        this.agua = agua;
        this.maxAgua = maxAgua;
    }

    void comer(){
        if(bucho < maxBucho){
            bucho +=1;
            System.out.println("Slp!! Glump!! Aaah!! Delicius!!");
        }else{
            System.out.println("Tô espocando!!! 0.o");
          }
    }

    void pular(){
        if(bucho > 0){
            bucho -= 1;
            agua  -= 1;
            System.out.println("Lá vou eu!! Jump!!");
        }else{
            System.out.println("Oh Fome!! Vou não!!");
        }
    }

    void hidratar(){
        if(agua < maxAgua){
            agua += 1;
            System.out.println("Humm!! Agua!!");
        }else{
            System.out.println("Dxaqueto!! Já tô molhadinho!!");
        }
    }

    void pegarSol(){
        if(agua > 0){
            agua -=1;
            System.out.println("Impressão minha ou estou ficando com a pele ressecada??");
        }else{
            System.out.println("C tá doiiidooo!! Vou morreeee!! Carlor dos seissentos!! Quero água!!");
        }
    }

    public String toString(){
    return "Bucho: " + bucho + "/" + maxBucho + " Nível de água: " + agua + "/" + maxAgua;
    }
    
    public static void main(String[] args) {
        //referência = criando objeto
        Cururu sapao = new Cururu(0, 10, 0, 10);
        System.out.println(sapao);
        sapao.pegarSol();
        sapao.pular();
        sapao.hidratar();sapao.hidratar();sapao.hidratar();sapao.hidratar();
        sapao.comer();sapao.comer();sapao.comer();sapao.comer();sapao.comer();
        System.out.println(sapao);
             
    }
    

}

/*sapao.comer();
    sapao.pular();
    sapao.pegarSol();
    sapao.hidratar();*/
