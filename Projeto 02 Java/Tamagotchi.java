import java.util.Scanner;

public class Tamagotchi {
    private int energiaMax;
    private int saciedadeMax;
    private int limpezaMax;
    private int energia;
    private int saciedade;
    private int limpeza;
    private int diamantes;
    private int idade;
    private boolean vivo = true;

    Tamagotchi(int energiaMax, int saciedadeMax, int limpezaMax){
        this.energiaMax = energiaMax;
        this.saciedadeMax =  saciedadeMax;
        this.limpezaMax = limpezaMax;
    }

    public void ajuda(){
    }

    public String toString() {
        return "E: " + energia + "/" + energiaMax + " || " +  "S: " + saciedade + "/" + saciedadeMax + " || " + "L: " + limpeza + "/" + limpezaMax + " || " + "D: " + diamantes + " || " + "I: " + idade;
    }

    boolean testVivo(){
        if(!vivo){
          System.out.println("voce não pode interagir com seu pet, ele morreu");
          return true;
        }
        return false;
    }

    public void setEnergia(int value){
        if(value <= 0){
            energia = 0;
            System.out.println("fail: pet morreu de fraqueza");
            vivo = false;
        }
        else if(value > energiaMax)
            energia = energiaMax;
        else
            energia = value;
    }

    public void brincar(){ //E - 3
        //retorna true e envia uma mensagem de erro avisando que o pet morreu  
        if(testVivo()) 
            return;
            setEnergia(getEnergia() - 3));
            setSaciedade(getSaciedade() - 1));
            setLimpeza(getLimpesa() - 2));
            setDiamantes(getDiamantes() + 1));
            setIdade(getIdade() + 1));
    }
    
    public void comer(){
        if(testVivo()) 
            return;
            setEnergia(getEnergia() - 1));
            setSaciedade(getSaciedade() + 4));
            setLimpeza(getLimpesa() - 2));
            setDiamantes(getDiamantes() + 0));
            setIdade(getIdade() + 1));
    }

    public void dormir(){
        if(testVivo()) 
            return;
            setEnergia(getEnergia() = maxEnergia);
            setIdade(getIdade() + 1));
    }
    
    public void tomarBanho(){
        if(testVivo()) 
            return;
            setEnergia(getEnergia() - 3));
            setSaciedade(getSaciedade() - 1));
            setLimpeza(getLimpesa() = maxLimpeza));
            setDiamantes(getDiamantes() + 0));
            setIdade(getIdade() + 2));
    }

    public void dormirSemSono(){
        
    }

    public void morrer(){
        if(testeVivo()) return;
        else if(energia == 0 || saciedade == 0 || limpeza == 0) vivo = false;

    }
    
    public static void public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi(20, 10, 15);
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(line.equals("end")){
                System.out.println("\n¡Adios amigo!\n");
                break;
            }else if(line.equals("ajuda")){
                pet.ajuda();
            }else if(line.equals("show")){
                System.out.println(pet);
            }else if(ui[0].equals("comer")){
                pet.comer(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("brincar")){
                pet.brincar(Integer.parseInt(ui[1]));
            }else if(ui[0].equals("dormir")){
                pet.dormir(Integer.parseInt(ui[1]));
            }else if(line.equals("tomar banho")){
                pet.tomarBanho();
            }else if(line.equals("domir sem sono")){
                pet.dormirSemSono();
            }else{
                System.out.println("\nFAIL!!! EOQ MAN?!\n");
            }
        }
        scanner.close();             
    }

}
