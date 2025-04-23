public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    //Construtor que inicializa todos os atributos e valida a data
    public Data(int dia, int mes, int ano) {
        if (!dataValida(dia, mes, ano)) {
            System.out.println("Data inválida. Definindo a data padrão: 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    //Métodos de acesso
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Método toString
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    //Método que verifica se é ano Bissexto
    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    //Método que valida a data
    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        switch (mes) {
            case 4: case 6: case 9: case 11:
                return dia >= 1 && dia <= 30;
            case 2:
                if (verificaAnoBissexto()) {
                    return dia >= 1 && dia <= 29;
                } else {
                    return dia >= 1 && dia <= 28;
                }
            default:
                return dia >= 1 && dia <= 31;
        }
    }
}
