public class Vestuario extends Loja{
    private boolean produtosImportados;
    //Construtor que inicializa todos os atributos de loja + Vestuario      
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }
    //métodos de acesso
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    //método toString
    @Override
    public String toString() {
        return super.toString() + ", produtosImportados: " + produtosImportados;
    }
}
