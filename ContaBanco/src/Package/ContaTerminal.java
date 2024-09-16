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

        float ballance = 0;
        boolean optionFirtsBallance = false;

        do {
            System.out.println("Deseja fazer um depósito (y/n) ? ");
            String answer = sc.next();
            if (answer.equals("y")){
                System.out.println("Informe o valor do depósito: ");
                ballance = sc.nextFloat();
                optionFirtsBallance = true;
            } else if (answer.equals("n")) {
                System.out.println("Ok, estaremos aguardando seu primeiro depósito!");
                optionFirtsBallance = true;
            }else {
                System.out.println("Opção inválida!");
            }
        } while(!optionFirtsBallance);



        UserAccount account = new UserAccount(nameClient, agencyAccount, numberAccount, ballance);
        System.out.println(account);



        sc.close();
    }
}
