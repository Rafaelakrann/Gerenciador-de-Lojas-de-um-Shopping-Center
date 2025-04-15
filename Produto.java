public class Produto {
    private String nome;
    private double preco;
    
    //Construtor que inicializa todos os atributos
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    //Métodos de acessos
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
       
    public String getNome(){
        return nome;
    }
    
     public double getPreco(){
        return preco;
    }
    
    //Método toString
    public String toString(){
        return "Produto [Nome: " + nome + ", Preço: " + preco + "]";
    }
    
}