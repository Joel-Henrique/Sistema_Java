public abstract class Cliente extends Tratamento{
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String nome;

    private double valor;
public double impressao(int quantidade){
    this.quantidade = quantidade;
    char c = 'e';
    while (c != 'D') {
        System.out.print(" A - PDF.\n B - WORLD \n C - IMAGENS\n D - Voltar\n");
        c = LeChar();
        switch (c) {
            case 'A': //PDF
                valor = this.quantidade * 0.10;
                break;
            case 'B': //WORLD
                valor = this.quantidade  * 0.20;
                break;
            case 'C': //IMAGENS
                valor = this.quantidade  * 0.30;
                break;
            case 'D': //Voltar
                break;
            default:
                System.out.println("Letra invalida! Tente novamente!");
        }
    }
    return valor;
}
}
