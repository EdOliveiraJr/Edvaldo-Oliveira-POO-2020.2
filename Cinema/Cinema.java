import java.util.ArrayList;

class Cliente {
    public String id;
    public String fone;

    public Cliente(String id, String fone){
        this.id = id;
        this.fone = fone;
    }

    public String toString(){
        return id + ":" + fone;
    }
}
class Cinema{
    ArrayList<Cliente> clientes = new ArrayList<>();

    clientes.add(new Pessoa(jose, 3333));
    
    clientes.add(new Pessoa(joao, 3332));

    clientes.add(new Pessoa(jacao, 3334));
    
    System.out.println(clientes);
}
