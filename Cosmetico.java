public class Cosmetico extends Loja{
    private double taxaComercializacao;
    //Construtor que inicializa todos os atributos da Loja + atributos de cosmetico
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
 //Método toString
    @Override
    public String toString() {
        return super.toString() + ", Taxa de Comercialização: " + taxaComercializacao;
    }
}
