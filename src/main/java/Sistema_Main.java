import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema_Main extends Tratamento {

    public static void main(String[] args)  {
        Menu();
    }
    public static void Menu(){
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        char c = 'e';
        while (c != 'D') {
            System.out.print(" A - Cadastrar funcionário.\n B - Selecionar funcionário \n C - Lista de impressão\n D - Sair\n");
            c = LeChar();
            switch (c) {
                case 'A': //Cadastrar funcionário
                    String Nome = LerNome();
                    Funcionario NVFunc = new Funcionario(Nome);
                    funcionarios.add(NVFunc);
                    break;
                case 'B': //Selecionar funcionário
                    System.out.println("Selecionando Funcionario: ");
                    seleciona_funcionario(funcionarios).realiza_registro();
                    break;
                case 'C': //Lista de impressão
                    clientes = Funcionario.getClientes();
                    for (int j = 0; j < clientes.size(); j++) {
                        System.out.println("Nome: "+ clientes.get(j).getNome() +" Quantidade: " + clientes.get(j).getQuantidade() + " valor: " + clientes.get(j).getValor());
                    }
                    break;
                case 'D': //Sair
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Letra invalida! Tente novamente!");
            }
        }
    }

    private static Funcionario seleciona_funcionario(List<Funcionario> funcionarios ){
        try {
            return funcionarios.get(LerInt()-1);
        } catch (Exception e) {
            System.out.println("O id informado não existe! Tente novamente! ");
            Menu();
        }
        return null;
    }
}



//o Cadastrar funcionário.
//o Selecionar funcionário.
//o Lista de impressão.
//o Sair.

//Criar uma classe Sistema, responsável pelo controle do
//sistema.
//● Criar a superclasse Arquivo e uma superclasse Cliente.
//● Criar as subclasses de Arquivo: “PDF, word, Imagens”.
//● Criar as subclasses de Clientes: “Pessoa, Empresa, Parceiro”
//● Criar as classes Impressão e Funcionário.

//Todos os funcionários devem, obrigatoriamente, possuir um campo de
//Identificação que será único e será gerado pelo próprio sistema. Além
//disso, eles devem possuir um método capaz de realizar um registro de
//impressão, feito por um cliente. As demais subclasses devem possuir um
//atributo nome, CPF para pessoas e CNPJ para Empresas e Parceiros.
//A classe Impressão será responsável por armazenar os dados da impressão,
//incluindo o cliente que realizou o pedido e o funcionário envolvido. Ela
//também deverá possuir uma lista estática contendo todos os pedidos de
//impressão feitos pelos funcionários.
//A classe Arquivo deve possuir um método que retorna o nome do arquivo
//com sua extensão e que deverá ser reescrita por cada uma de suas
//subclasses.

//o Após a seleção do funcionário pergunte ao usuário o tipo de
//cliente e registre ele no sistema, os clientes disponíveis
//são: Empresa, Parceiro e Pessoa.
//o Também deverá ser registrado o pedido de impressão, feito por
//um funcionário, e o tipo de arquivo a ser impresso. No fim, o
//valor da impressão deverá ser mostrado no console. Para os
//Parceiros o valor de cada cópia de um arquivo será de R$0.10,
//para as empresas as cópias custaram R$0.20 e as Pessoas devem
//pagar R$0.30. Pedidos acima de 500 unidades devem receber um
//desconto de 20%.