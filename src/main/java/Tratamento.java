import java.util.Scanner;

public class Tratamento {
        public static char LeChar() {
            Scanner Teclado = new Scanner(System.in);
            char x;
            try {
                System.out.print("Digite uma letra -> :");
                x = Teclado.next().charAt(0);
                x = Character.toUpperCase(x);
                return x;
            } catch (Exception e) {
                System.out.println("Letra invalida!");
                x = LeChar();
                return x;
            }
        }
    /*
    public static String LerNome(){
        Scanner teclado = new Scanner(System.in);
        String Nome;
        System.out.println("Digite um nome: ");
        Nome = teclado.nextLine().trim();
        if(!Nome.isEmpty())
            return Nome;
        else {
            System.out.println("Nome invalido! ");
            return Nome = LerNome();
        }
    }
    */
        public static String LerNome () {
            Scanner teclado = new Scanner(System.in);
            String Nome;
            System.out.println("Digite um nome: ");
            Nome = teclado.nextLine().trim();
            try {
                if (!Nome.isEmpty())
                    return Nome;
                else {
                    System.out.print("Nome Nulo!");
                    return LerNome();
                }
            } catch (Exception e) {
                System.out.println("Nome Invalido!");
                return LerNome();
            }
        }
    public static String LerCPF () {
        Scanner teclado = new Scanner(System.in);
        String Nome;
        System.out.println("Digite um CPF: ");
        Nome = teclado.nextLine().trim();
        try {
            if (!Nome.isEmpty())
                return Nome;
            else {
                System.out.print("CPF Nulo!");
                return LerNome();
            }
        } catch (Exception e) {
            System.out.println("CPF Invalido!");
            return LerNome();
        }
    }
    public static String LerCNPJ () {
        Scanner teclado = new Scanner(System.in);
        String Nome;
        System.out.println("Digite um CNPJ: ");
        Nome = teclado.nextLine().trim();
        try {
            if (!Nome.isEmpty())
                return Nome;
            else {
                System.out.print("CNPJ Nulo!");
                return LerNome();
            }
        } catch (Exception e) {
            System.out.println("CNPJ Invalido!");
            return LerNome();
        }
    }
        public static int LerInt () {
            Scanner teclado = new Scanner(System.in);
            int x;
            try {
                System.out.print("Digite um numero: ");
                x = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Numero invalido! Digite novamente: ");
                x = LerInt();
            }
            return x;
        }

}
