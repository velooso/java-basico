package Package;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, é bom ter você conosco!");
        System.out.println("Insira seu nome:");
        String nameClient = sc.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencyAccount = sc.next();

        System.out.println("Agora, insira um número para sua conta:");
        int numberAccount = sc.nextInt();

        System.out.println("Insira o valor do seu primeiro depósito:");
        float ballance = sc.nextFloat();

        UserAccount account = new UserAccount(nameClient, agencyAccount, numberAccount, ballance);

        System.out.println("Sua conta foi criada com sucesso e seu saldo já foi contabilizado!\n");
        System.out.println(account);



        sc.close();
    }
}
