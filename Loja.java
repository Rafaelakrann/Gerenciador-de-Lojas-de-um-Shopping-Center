public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    //Construtor que inicializa todos os atributos
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
 
    }
    
    //Construtor que inicia os atributos nome e quantidadeFuncionarios, com salarioBaseFuncionario com -1
    public Loja (String nome, int quantidadeFuncionarios){
       this(nome, quantidadeFuncionarios, -1);
    }
    
    // Métodos de acesso (getters e setters) para todos os atributos
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
              
    public double getSalarioBaseFuncionario(){
        if (salarioBaseFuncionario == 0.0) {
            return -1;
        } else {
            return salarioBaseFuncionario;
        }
    }
    //Método gasto com salário
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        } else {
            return (quantidadeFuncionarios*salarioBaseFuncionario);
        }
    }
    //Método tamanho da loja
    public int tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
    //Método toString
    public String toString(){
        return "Loja [Nome: " + nome + ", Número de funcionários: " + quantidadeFuncionarios + "]";
    }
}