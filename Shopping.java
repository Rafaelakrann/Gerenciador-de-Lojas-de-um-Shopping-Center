import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor que inicializa nome, endereco e a quantidade maxima de lojas
    public Shopping(String nome, Endereco endereco, int capacidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeMaximaLojas];
    }

    // Métodos de acesso para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Shopping[nome: " + nome + ", endereço: " + endereco + ", Lojas: " + Arrays.toString(lojas) + "]";
    }

    // Método insereLoja: insere uma Loja no array lojas do Shopping
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) { // Encontrou uma posição livre
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false; // Não encontrou espaço livre para inserir a nova loja
    }

    // Método removeLoja: remove uma Loja do array lojas pelo nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Não encontrou a loja com o nome especificado
    }

    // Método quantidadeLojasPorTipo: retorna a quantidade de lojas de um tipo específico
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contador = 0;

        // se o tipoLoja nao for nenhuma loja existente, retorna -1
        if (tipoLoja == null) {
            return -1;
        }

        // loop para evitar erro nullPointer
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                continue;
            }

            // verifica do tipo da loja e incrementa o contador caso a loja seja uma instancia da loja informada
            switch (tipoLoja.toLowerCase()) {
                case "cosmético":
                    if (lojas[i] instanceof Cosmetico) {
                        contador++;
                    }
                    break;
                case "vestuário":
                    if (lojas[i] instanceof Vestuario) {
                        contador++;
                    }
                    break;
                case "bijuteria":
                    if (lojas[i] instanceof Bijuteria) {
                        contador++;
                    }
                    break;
                case "alimentação":
                    if (lojas[i] instanceof Alimentacao) {
                        contador++;
                    }
                    break;
                case "informática":
                    if (lojas[i] instanceof Informatica) {
                        contador++;
                    }
                    break;
                default:
                    return -1;
            }
        }
        return contador;
    }

    // Método lojaSeguroMaisCaro: retorna a loja de Informática com o maior valor de seguro de eletrônicos
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        double seguroMaisCaro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                double seguroAtual = lojaInformatica.getSeguroEletronicos();
                if (seguroAtual > seguroMaisCaro) {
                    lojaSeguroMaisCaro = lojaInformatica;
                    seguroMaisCaro = seguroAtual;
                }
            }
        }
        return lojaSeguroMaisCaro;
    }
}
