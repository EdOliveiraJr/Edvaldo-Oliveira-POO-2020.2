enum Dinheiro{
    N5(5, 2),
    N10(10, 2), 
    N20(20, 2), 
    N50(50, 2), 
    N100(100, 2),
    N200(200, 2);

    int valor;
    int volume;

    Dinheiro(int valor, int volume){
        this.valor = valor;
        this.volume = volume;
    }

    public String toString(){
        return  "Valor: " + valor + "\nVolume: " + volume + "\n";
    }
}

class Item{
    String descricao;
    int volume;

    Item(String descricao, int volume){
        this.descricao = descricao;
        this.volume = volume;
    }

    public String toString(){
        return "Descricao: " + descricao + "\nVolume: " + volume + "\n";
    }
}

class Cofre{
    String itens = "";
    int valor = 0;
    int volume = 0;
    int volumeMax;
    boolean estaFechado = true;

    Cofre(int volumeMax){
        this.volumeMax = volumeMax;
    }

    boolean adicionarDinheiro(Dinheiro dinheiro){
        if(estaFechado){
            System.out.println("O cofre está fechado. Abra o cofre.");
            return false;
        }
        if(dinheiro.volume + this.volume > this.volumeMax){
            System.out.println("Cofre esta cheio. Pegue dinheiro");
            return false;
        }

        this.valor += dinheiro.valor;
        this.volume += dinheiro.volume;
        return true;
    }

    boolean adicionarItem(Item item){
        if(estaFechado){
            System.out.println("O cofre está fechado. Abra o cofre.");
            return true;
        }
        
        if(this.volume + item.volume > volumeMax){
            System.out.println("Objeto não cabe no cofre. Pegue item.");
            return false;
        }
        this.volume += item.volume;
        if(this.itens.equals(""))
            this.itens = item.descricao;
        else
            this.itens += ", " + item.descricao;
        return true;
    }

    boolean abrirCofre(){
        if(estaFechado){
            estaFechado = false;
            System.out.println("Cofre foi aberto.");
            return true;
        }else{
            System.out.println("Cofre já está aberto");
            return false;
        }
        
    }

    boolean fecharCofre(){
        if(!estaFechado){
            estaFechado = true;
            System.out.println("Cofre foi fechado");
            return true;
        }else{
            System.out.println("Cofre já está fechado");
            return false;
        }
            
    }   
    
    int pegarDinheiro(){
        if(estaFechado){
            System.out.println("O cofre precisa ser aberto");
            return 0;
        }
        else{
            int aux = this.valor;
            this.valor = 0;
            return aux;
        }
            
    }

    String pegarItem(){
        if(estaFechado){
            System.out.println("O cofre precisa ser aberto");
            return "";
        }else{
            String aux = this.itens;
            this.itens = "";
            return aux;
        }
            
    }

    public String toString(){
        return itens + ":" + valor + ":" + volume + "/" + volumeMax + ":" + estaFechado;
    }

}

public class Patrao {
    public static void main(String[] args) {
        Cofre cofre = new Cofre(50);
        System.out.println(cofre);
        cofre.adicionarDinheiro(Dinheiro.N100);
        cofre.adicionarDinheiro(Dinheiro.N50);
        System.out.println(cofre);
        cofre.adicionarItem(new Item("Rubi", 20));
        System.out.println(cofre);
        cofre.adicionarItem(new Item("BarraDeOuro", 20));
        System.out.println(cofre);
        cofre.adicionarItem(new Item("ferrari", 1000));
        System.out.println(cofre);
        cofre.abrirCofre();
        System.out.println(cofre);
        cofre.adicionarDinheiro(Dinheiro.N100);
        cofre.adicionarDinheiro(Dinheiro.N50);
        System.out.println(cofre);
        cofre.adicionarItem(new Item("Rubi", 20));
        System.out.println(cofre);
        cofre.adicionarItem(new Item("BarraDeOuro", 20));
        System.out.println(cofre);
        cofre.adicionarItem(new Item("ferrari", 1000));
        System.out.println(cofre);
        cofre.fecharCofre();
        System.out.println(cofre);
        cofre.pegarDinheiro();
        cofre.pegarItem();
        cofre.abrirCofre();
        System.out.println(cofre);
        cofre.pegarDinheiro();
        cofre.pegarItem();
        System.out.println(cofre);
    
    }
    
}