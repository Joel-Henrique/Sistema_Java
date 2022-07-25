public class Pessoa extends Cliente{
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String nome;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    private String CPF;

    public Pessoa(String nome,String cpf) {
        setNome(nome);
        setCPF(cpf);
    }
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    private double valor = 0.0;

    @Override
    public double impressao(int quantidade){
        this.quantidade = quantidade;
        char c = 'e';
        while (c != 'D') {
            System.out.print(" A - PDF.\n B - WORLD \n C - IMAGENS\n D - Voltar\n");
            c = LeChar();
            switch (c) {
                case 'A': //PDF
                    valor = quantidade * 0.40;
                    return valor;
                case 'B': //WORLD
                    valor = quantidade * 0.50;
                    return valor;
                case 'C': //IMAGENS
                    valor = quantidade * 0.60;
                    return valor;
                case 'D': //Voltar
                    break;
                default:
                    System.out.println("Letra invalida! Tente novamente!");
                    return valor;
            }
        }
        return valor;
    }
}
//As demais subclasses devem possuir um
//atributo nome, CPF para pessoas e CNPJ para Empresas e Parceiros.