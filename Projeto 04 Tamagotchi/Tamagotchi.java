import java.util.Scanner;

class Pet {
    private int energia;
    private int energiaMax;
    private int limpeza;
    private int limpezaMax;
    private int saciedade;
    private int saciedadeMax;
    private int diamante;
    private int idade;
    private boolean vivo;

    public Pet(int energiaMax, int saciedadeMax, int limpezaMax){
        this.energia = energiaMax;
        this.energiaMax = energiaMax;
        this.limpeza = limpezaMax;
        this.limpezaMax = limpezaMax;
        this.saciedade = saciedadeMax;
        this.saciedadeMax = saciedadeMax;
        this.diamante = 0;
        this.idade = 0;
        this.vivo = true;
    }

    private void setEnergia(int value){
        energia = value;
        if(energia <= 0){
            energia = 0;
            System.out.println("Seu Tamagotchi bateu as botas por falta de energia");
            this.vivo = false;
        }
        if(energia > energiaMax)
            energia = energiaMax;
    }

    private void setSaciedade(int value){
        saciedade = value;
        if(saciedade <= 0){
            saciedade = 0;
            System.out.println("Seu Tamagotchi bateu as botas por fome");
            this.vivo = false;
        }
        if(saciedade > saciedadeMax)
            saciedade = saciedadeMax;
    }

    private void setLimpeza(int value){
        limpeza = value;
        if(limpeza <= 0){
            limpeza = 0;
            System.out.println("Seu Tamagotchi bateu as botas por falta de limpeza");
            this.vivo = false;
        }
        if(limpeza > limpezaMax)
            limpeza = limpezaMax;
    }

    public int getEnergia(){
        return energia;
    }

    public int getSaciedade(){
        return saciedade;
    }

    public int getLimpeza(){
        return limpeza;
    }

    boolean testeMorto(){
        if(this.vivo)
            return false;
        System.out.println("Morto nao faz nada");
            return true;
    
    }

    public boolean estaVivo(){
        return this.vivo;
    }

    public void iniciar(){
      
    }

    public void mostrar(){
        
    }
    
    public void brincar(){
        if(testeMorto())
            return;
        this.setEnergia(this.getEnergia() - 2);
        this.setSaciedade(this.getSaciedade() - 1);
        this.setLimpeza(this.getLimpeza() - 3);
        this.diamante ++;
        this.idade ++;
    }

    public void comer(){
        if(testeMorto())
            return;
        this.setEnergia(this.getEnergia() - 1);
        this.setSaciedade(this.getSaciedade() + 4);
        this.setLimpeza(this.getLimpeza() - 2);
        this.idade ++;
    }

    public void dormir(){
        if(testeMorto())
            return;
        this.setEnergia(this.energiaMax);
        this.idade ++;
    }

    public void banho(){
        if(testeMorto())
            return;
        this.setEnergia(this.getEnergia() - 3);
        this.setSaciedade(this.getSaciedade() - 1);
        this.setLimpeza(this.limpezaMax);
        this.idade += 2;
    }

    public String toString(){
        return "E:" + energia + "/" + energiaMax + ", " + "S:" + saciedade + "/" + saciedadeMax + ", " + "L:" + limpeza + "/" + limpezaMax + ", " + "D:" + diamante + ", " + "I:" + idade;
    }

}

public class Tamagotchi {
    public static void main(String[] args) {
        Pet tamagotchi = new Pet(50, 50, 50);
        System.out.println(tamagotchi);
        tamagotchi.brincar();
        System.out.println(tamagotchi);
        tamagotchi.comer();
        System.out.println(tamagotchi);
        tamagotchi.dormir();
        System.out.println(tamagotchi);
        tamagotchi.banho();
        System.out.println(tamagotchi);

        while(tamagotchi.estaVivo()){
            tamagotchi.brincar();
            System.out.println(tamagotchi);
        }

        System.out.println(tamagotchi);
        tamagotchi.brincar();
        System.out.println(tamagotchi);
        tamagotchi.comer();
        System.out.println(tamagotchi);
        tamagotchi.dormir();
        System.out.println(tamagotchi);
        tamagotchi.banho();
        System.out.println(tamagotchi);


        /*Scanner scanner = new Scanner(System.in);
        
        while(true){

            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(line.equals("sair")){
                System.out.println("Tchau, Xero!");
                break;
            }else if(line.equals("iniciar")){
                tamagotchi.iniciar();
                System.out.println("O Tamagotchi nasceu!!");
            }else if(line.equals("mostrar")){
                tamagotchi.mostrar();
            }else{
                System.out.println("Comando Invalido");
            }
        } */       
    }
}       
 