class Pokemon{
    private int vida;
    private int vidaMax;
    private boolean alive;

    public Pokemon(int vidaMax){
        this.vida = vidaMax;
        this.vidaMax = vidaMax;
        this.alive = true;
    }

    private void setVida(int value){
        vida = value;
        if(vida <= 0){
            vida = 0;
            System.out.println("Seu pet morreu de cansaço");
            this.alive = false;
        }
        if(vida > vidaMax)
            vida = vidaMax;

    }

    boolean testarMorto(){
        if(this.alive)
            return false;
        System.out.println("Voce nao pode interagir com um pet morto");
            return true;
    }

    public void apanhar(int dano){
        if(testarMorto())
            return;
        this.setVida(this.getVida() - 5);
    }

    public void curar(int pv){
        this.setVida(pv);
        this.getVida();
    }

    public void brincar(){
        if(testarMorto())
            return;
        this.setVida(this.getVida() - 2);
    }

    public int getVida(){
        return vida;
    }

    public boolean isAlive(){
        return this.alive;
    }

    public String toString(){
        return vida + "/" + vidaMax;
    }
}

public class Mewtwo {
    public static void main(String[] args) {
        Pokemon mewtwo = new Pokemon(50);

        while(mewtwo.isAlive()){
            mewtwo.brincar();
            System.out.println(mewtwo);
        }
    }       
 
}
