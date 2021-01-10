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
            System.out.println("Seu Tamagotchi bateu as botas por falta de energia. Reinicie e Inicie um novo!");
            this.vivo = false;
        }
        if(energia > energiaMax)
            energia = energiaMax;
    }

    private void setSaciedade(int value){
        saciedade = value;
        if(saciedade <= 0){
            saciedade = 0;
            System.out.println("Seu Tamagotchi bateu as botas por fome. Reinicie e Inicie um novo!");
            this.vivo = false;
        }
        if(saciedade > saciedadeMax)
            saciedade = saciedadeMax;
    }

    private void setLimpeza(int value){
        limpeza = value;
        if(limpeza <= 0){
            limpeza = 0;
            System.out.println("Seu Tamagotchi bateu as botas por falta de limpeza. Reinicie e Inicie um novo!");
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
        System.out.println("Você deixou o Tamagotchi morrer, Reinicie e Inicie um novo!");
            return true;
    
    }

    public boolean estaVivo(){
        return this.vivo;
    }

    public void brincar(){
        if(testeMorto())
            return;
        this.setEnergia(getEnergia() - 2);
        this.setSaciedade(getSaciedade() - 1);
        this.setLimpeza(getLimpeza() - 3);
        this.diamante ++;
        this.idade ++;
    }

    public void comer(){
        if(testeMorto())
            return;
        this.setEnergia(getEnergia() - 1);
        this.setSaciedade(getSaciedade() + 4);
        this.setLimpeza(getLimpeza() - 2);
        this.idade ++;
    }

    public void dormir(){
        if(testeMorto())
            return;
        this.setEnergia(energiaMax);
        this.idade ++;
    }

    public void banhar(){
        if(testeMorto())
            return;
        this.setEnergia(getEnergia() - 3);
        this.setSaciedade(getSaciedade() - 1);
        this.setLimpeza(limpezaMax);
        this.idade += 2;
    }

    public String toString(){
        return "E:" + energia + "/" + energiaMax + ", " + "S:" + saciedade + "/" + saciedadeMax + ", " + "L:" + limpeza + "/" + limpezaMax + ", " + "D:" + diamante + ", " + "I:" + idade;
    }

}

public class Tamagotchi {
    public static void main(String[] args) {
        /*Pet tamagotchi = new Pet(50, 50, 50);
        System.out.println(tamagotchi);
        tamagotchi.brincar();
        System.out.println(tamagotchi);
        tamagotchi.comer();
        System.out.println(tamagotchi);
        tamagotchi.dormir();
        System.out.println(tamagotchi);
        tamagotchi.banhar();
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
        tamagotchi.banhar();
        System.out.println(tamagotchi);*/


        Scanner scanner = new Scanner(System.in);
        
        while(true){

            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(ui[0].equals("iniciar")){
                Pet tamagotchi1 = new Pet(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]),Integer.parseInt(ui[3]));
                System.out.println("O Tamagotchi nasceu!!");
                System.out.println(tamagotchi1);
                
                while(true){

                    String line2 = scanner.nextLine();
                    String[] ui2 = line.split(" ");
                    
                    if(line2.equals("reiniciar")){
                        System.out.println("Trágico! Inicie um novo Tamagotchi!");
                        break;
                    }else if(line2.equals("mostrar")){
                        System.out.println(tamagotchi1);
                    }else if(line2.equals("brincar")){
                        tamagotchi1.brincar();
                        System.out.println(tamagotchi1);
                    }else if(line2.equals("comer")){
                        tamagotchi1.comer();
                        System.out.println(tamagotchi1);
                    }else if(line2.equals("dormir")){
                        tamagotchi1.dormir();
                        System.out.println(tamagotchi1);
                    }else if(line2.equals("banhar")){
                        tamagotchi1.banhar();
                        System.out.println(tamagotchi1);
                    }else{
                        System.out.println("Comando Invalido");
                    }
                }
            }else if(line.equals("sair")){
                System.out.println("Tchau, Xero!");
                break;
            }else{
                System.out.println("Comando Invalido");
            }
        }
    }
}       
 