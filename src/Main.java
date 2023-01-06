import com.currency.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        System.out.println("\t\t\t=========Currency Convertor=========\n\n");
        int currencyChoice = app.getChoice();
        Double amount = app.getAmount();
        Currency currentCurrency = app.getCurrencyFor(currencyChoice, amount);
        int requiredCurrencyChoice = app.getChoice();
        Currency requiredCurrency = app.convert(currentCurrency, requiredCurrencyChoice);
        System.out.println(requiredCurrency);
    }

    private Currency convert(Currency currentCurrency, int requiredCurrencyChoice) {
        switch (requiredCurrencyChoice) {
            case 1 -> {
                return currentCurrency.toAUD();
            }
            case 2 -> {
                return currentCurrency.toUSD();
            }
            case 3 -> {
                return currentCurrency.toINR();
            }
            default -> {
                return currentCurrency.toKWD();
            }
        }
    }

    private int getChoice() {
        int choice = 0;
        boolean choiceIsValid = false;
        while (!choiceIsValid) {
            try {
                choice = acceptChoice();
                if (choice < 1 || choice > 5) {
                    throw new InvalidChoiceException("Invalid choice");
                }
                choiceIsValid = true;
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
        return choice;
    }

    private Currency getCurrencyFor(int choice, Double amount) {
        switch (choice) {
            case 1 -> {
                return new AustralianDollar(amount);
            }
            case 2 -> {
                return new USD(amount);
            }
            case 3 -> {
                return new IndianRupee(amount);
            }
            default -> {
                return new KuwaitiDinar(amount);
            }
        }
    }

    private Double getAmount() {
        System.out.print("Enter the Amount : ");
        return new Scanner(System.in).nextDouble();
    }

    private int acceptChoice() {
        Scanner sc = new Scanner(System.in);
        boolean allIsWell = false;
        int choice = 0;
        while (!allIsWell) {
            try {
                System.out.println("1. Australian Dollar");
                System.out.println("2. US Dollar");
                System.out.println("3. Indian Rupee");
                System.out.println("4. Kuwaiti Dinar");
                System.out.println("5. Exit");

                System.out.println("Enter the Denomination:");
                choice = sc.nextInt();
                allIsWell = true;
            } catch (InputMismatchException ime) {
                System.out.println("Enter only number value");
            }
        }
        return choice;
    }
}
