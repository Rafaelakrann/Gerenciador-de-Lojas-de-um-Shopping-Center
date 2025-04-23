import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data dataProduto = null;
        Loja loja = null;
        Produto produto = null;

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("[1] Criar uma loja");
            System.out.println("[2] Criar um produto");
            System.out.println("[3] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                System.out.println("----- LOJA -----");
                System.out.print("Insira o nome da loja: ");
                String nome = input.nextLine();
                System.out.print("Insira a quantidade de funcionários: ");
                int quantidadeFuncionarios = input.nextInt();
                System.out.print("Insira o salário base dos funcionários: ");
                double salarioBaseFuncionarios = input.nextDouble();

                System.out.println("----- ENDEREÇO DA LOJA -----");
                System.out.print("Rua: ");
                input.nextLine();
                String rua = input.nextLine();

                System.out.print("Cidade: ");
                String cidade = input.nextLine();

                System.out.print("Estado: ");
                String estado = input.nextLine();

                System.out.print("País: ");
                String pais = input.nextLine();

                System.out.print("CEP: ");
                String cep = input.nextLine();

                System.out.print("Número: ");
                String numero = input.nextLine();

                System.out.print("Complemento: ");
                String complemento = input.nextLine();

                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                System.out.println("---- DATA DE FUNDAÇÃO ----");
                System.out.print("Dia: ");
                int dia = input.nextInt();

                System.out.print("Mes: ");
                int mes = input.nextInt();

                System.out.print("Ano: ");
                int ano = input.nextInt();

                Data dataLoja = new Data(dia, mes, ano);

                loja.setNome(nome);
                loja.setQuantidadeFuncionarios(quantidadeFuncionarios);
                loja.setSalarioBaseFuncionario(salarioBaseFuncionarios);
                loja.setEndereco(endereco);
                loja.setDataFundacao(dataLoja);

                System.out.println(loja);
                } else if (opcao == 2) {
                System.out.println("---- PRODUTO ----");
                System.out.print("Insira o nome do produto: ");
                String nome = input.nextLine();

                System.out.print("Insira o preço do produto: ");
                double preco = input.nextDouble();
                input.nextLine();

                System.out.println("--- DATA DE VALIDADE ----");
                System.out.print("Dia: ");
                int dia = input.nextInt();

                System.out.print("Mes: ");
                int mes = input.nextInt();

                System.out.print("Ano: ");
                int ano = input.nextInt();

                dataProduto = new Data(dia, mes, ano);

                produto = new Produto(nome, preco, dataProduto);

                if (!produto.estaVencido(new Data(20, 10, 2023))) {
                    System.out.println("PRODUTO NÃO VENCIDO");
                } else {
                    System.out.println("PRODUTO VENCIDO");
                }
            } else if (opcao == 3) {
                return;
            } else {
                System.out.println("Opção Inválida");
            }
        }
    }
}