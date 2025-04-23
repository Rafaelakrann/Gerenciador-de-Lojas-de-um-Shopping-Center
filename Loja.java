import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos; // Novo atributo
    
    // Construtor que inicializa todos os atributos, incluindo estoqueProdutos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoMaximoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoMaximoEstoque]; // Inicializa o array
    }

    // Construtor que inicializa nome, quantidade de funcionários, endereço, data de fundação e tamanho do estoque
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoMaximoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoMaximoEstoque]; // Inicializa o array 
    }
    // Métodos de acesso (getters e setters) para todos os atributos
    public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double getSalarioBaseFuncionario(){
        if (salarioBaseFuncionario == 0.0) {
            return -1;
        } else {
            return salarioBaseFuncionario;
        }
    }
    
    public Endereco getEndereco() {
    return endereco;
    }

    public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
    }

    public Data getDataFundacao() {
    return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
    }
    // Métodos de acesso para o atributo estoqueProdutos
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método gastosComSalario: retorna o gasto total com salário dos funcionários
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1; // Não é possível calcular os gastos com salário se o salário base não estiver definido
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    // Método tamanhoDaLoja: retorna o tamanho da loja com base na quantidade de funcionários
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P'; // Pequena
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M'; // Média
        } else {
            return 'G'; // Grande
        }
    }
    
    // Método toString
        public String toString() {
        return "Loja= " +
                "Nome: " + nome + '\'' +
                ", Quantidade de funcionários: " + quantidadeFuncionarios +
                ", Salario Base dos Funcionarios: " + salarioBaseFuncionario +
                ", Endereço: " + endereco +
                ", data de Fundação: " + dataFundacao +
                ", estoque de Produtos: " + Arrays.toString(estoqueProdutos);
    }
    
    // Método imprimeProdutos: imprime as informações de todos os produtos da loja
    public void imprimeProdutos() {
        System.out.println("Produtos da Loja " + nome + ":");
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto); // Chama o método toString
            }
        }
    }
    // Método insereProduto: insere um Produto no estoque da loja
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false; 
    }
    // Método removeProduto: remove um Produto do estoque da loja pelo nome
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false; // Produto não encontrado 
    }
}

