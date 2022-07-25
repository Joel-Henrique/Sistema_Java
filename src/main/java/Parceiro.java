public class Parceiro extends Cliente{
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String nome;

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    private String CNPJ;

    public Parceiro(String nome,String CNPJ) {
        setNome(nome);
        setCNPJ(CNPJ);
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
    public double impressao(int quantidade) {
        this.quantidade = quantidade;
        char c = 'e';
        while (c != 'D') {
            System.out.print(" A - PDF.\n B - WORLD \n C - IMAGENS\n D - Voltar\n");
            c = LeChar();
            switch (c) {
                case 'A': //PDF
                    valor = quantidade * 0.12;
                    return valor;
                case 'B': //WORLD
                    valor = quantidade * 0.22;
                    return valor;
                case 'C': //IMAGENS
                    valor = quantidade * 0.30;
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
