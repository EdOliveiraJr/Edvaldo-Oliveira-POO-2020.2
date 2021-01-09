import java.util.Scanner;

import jdk.internal.jshell.tool.resources.version;

enum Dinheiro {
    N10(10, 2), 
    N50(50, 2), 
    N100(100, 2);

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
    
        Scanner scanner = new Scanner(System.in);

        while(true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");

            if(line.equals("end")){
                System.out.println("O cofre sumiu. FIM.");
                break;
            }else if(ui[0].equals("adicionardinheiro")){
                if(!cofre.estaFechado){
                    if(ui[1].equals("10")){
                        cofre.adicionarDinheiro(Dinheiro.N10);
                        System.out.println("Você guardou 10\n");
                        System.out.println(cofre);                        
                    }else if(ui[1].equals("50")){
                        cofre.adicionarDinheiro(Dinheiro.N50);
                        System.out.println("Você guardou 50\n");
                        System.out.println(cofre);
                    }else if(ui[1].equals("100")){
                        cofre.adicionarDinheiro(Dinheiro.N100);
                        System.out.println("Você guardou 100\n");
                        System.out.println(cofre);
                    }
                }else{
                    System.out.println("O cofre está fechado");
                }
            }else if(ui[0].equals("adicionaritem")){
                if(!cofre.estaFechado){
                    Item item = new Item(ui[1], Integer.parseInt(ui[2]));
                    cofre.adicionarItem(item);
                    System.out.println("Você guardou um Item no cofre\n");
                    System.out.println(cofre);
                }else{
                    System.out.println("O cofre está fechado");
                }
                    
            }else if(ui[0].equals("abrir")){
                cofre.abrirCofre();
            }else if(ui[0].equals("fechar")){
                cofre.fecharCofre();
            }else if(ui[0].equals("pegardinheiro")){
                cofre.pegarDinheiro();
            }else if(ui[0].equals("pergaritem")){
                cofre.pegarItem();
            }
            else if(ui[0].equals("ver")){
                System.out.println(cofre);
            }else{
                System.out.println("Comando Invalido");
            }

        }
        
    }
    
}