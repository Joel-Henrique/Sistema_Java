import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Tratamento{
    private static int idSistema = 0;

    public static List<Cliente> getClientes() {
        return clientes;
    }

    private static List<Cliente> clientes = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String nome ="";
    private int id;
    public int getId() {
        return id;
    }

    public Funcionario(String nome) {
        idSistema++;
        this.id = idSistema;
        setNome(nome);

    }
    public void realiza_registro(){
        String Nome;
        String CNPJ;
        String Cpf;
        int qnt;
        char c = 'e';
        while (c != 'D') {
            System.out.print(" A - Cadastrar Empresa.\n B - Cadastrar Parceiro \n C - Cadastrar Pessoa\n D - Voltar\n");
            c = LeChar();
            switch (c) {
                case 'A': //Cadastrar Empresa
                    CNPJ = LerCNPJ();
                    Nome = LerNome();
                    Empresa empresa = new Empresa(Nome,CNPJ);
                    System.out.println("Digite a Quantidade: ");
                    qnt = LerInt();
                    System.out.println("Quantidade: "+qnt+"valor: " + empresa.impressao(qnt));
                    clientes.add(empresa);

                    break;
                case 'B': //Cadastrar Parceiro
                    CNPJ = LerCNPJ();
                    Nome = LerNome();
                    Parceiro parceiro = new Parceiro(Nome,CNPJ);
                    System.out.println("Digite a Quantidade: ");
                    qnt = LerInt();
                    System.out.println("Quantidade: "+qnt+"valor: " + parceiro.impressao(qnt));
                    clientes.add(parceiro);
                    break;
                case 'C': //Cadastrar Pessoa
                    Nome = LerCPF();
                    Cpf = LerNome();
                    Pessoa pessoa = new Pessoa(Nome,Cpf);
                    System.out.println("Digite a Quantidade: ");
                    qnt = LerInt();
                    System.out.println("Quantidade: "+qnt+"valor: " + pessoa.impressao(qnt));
                    clientes.add(pessoa);
                    break;
                case 'D': //Voltar
                    break;
                default:
                    System.out.println("Letra invalida! Tente novamente!");
            }
        }
    }


}
///Todos os funcionários devem, obrigatoriamente, possuir um campo de
//Identificação que será único e será gerado pelo próprio sistema. Além
//disso, eles devem possuir um método capaz de realizar um registro de
//impressão, feito por um cliente. As demais subclasses devem possuir um
//atributo nome, CPF para pessoas e CNPJ para Empresas e Parceiros.