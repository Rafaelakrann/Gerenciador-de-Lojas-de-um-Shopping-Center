public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;
    
    //Construtor que inicializa todos os atributos
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    // Métodos de acesso
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

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    //Método toString
    public String toString() {
        return "Produto [Nome: " + nome + ", Preço: " + preco + ", Data de validade: " + dataValidade + "]";
    }
    //Método que verifica se esta vencido
    public boolean estaVencido(Data dataReferencia) {
        // Verifica se a data de referência é posterior à data de validade do produto
        if (dataReferencia.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataReferencia.getAno() == dataValidade.getAno() && dataReferencia.getMes() > dataValidade.getMes()) {
            return true;
        } else if (dataReferencia.getAno() == dataValidade.getAno() && dataReferencia.getMes() == dataValidade.getMes() && dataReferencia.getDia() > dataValidade.getDia()) {
            return true;
        }
        return false;
    }
}