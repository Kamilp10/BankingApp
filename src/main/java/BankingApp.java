import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Welcome to our Bank App");
        account.createAccount();
        int inputNumber;
        do {
            System.out.println("Wybierz co chcesz zrobić.\n1.Pokaż informacje o koncie.\n2.Wpłata gotówki.\n3.wypłata.\n4.Wyjście.");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    account.showAccount();
                    break;
            }
        }
        while (inputNumber != 4);
    }

    }
