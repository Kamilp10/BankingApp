import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Welcome to our Bank App");
        account.createAccount();
        int inputNumber;
        do {
            System.out.println("Choose an available option.\n1.Show account details.\n2.Cash deposit.\n3.Cash withdrawal.\n4.Exit.");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    account.showAccount();
                    break;
                case 2:
                    account.deposit();
                    break;
            }
        }
        while (inputNumber != 4);
    }

    }
