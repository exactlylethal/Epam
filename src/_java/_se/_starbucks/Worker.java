package _java._se._starbucks;

import java.util.Arrays;
import java.util.Scanner;

public class Worker implements WorkerRules {
    private Scanner scanner = new Scanner(System.in);
    private Client name = new Client();
    private CoffeeType chosenType;
    private String tg = " tenge";

    @Override
    public void greetings() {
        System.out.println("Hello! I'm Alice! Welcome to Starbucks! What is your name?");
        name.clientName = scanner.nextLine();
        System.out.println("Please " + name.clientName + " make your order.");
        System.out.println("Available coffee options: " + Arrays.asList(CoffeeType.values()));
    }

    @Override
    public void yourOrder() {
        System.out.println("I would like to order ");
        String yourChoice = scanner.nextLine();
        chosenType = CoffeeType.findByName(yourChoice);
        if (chosenType != null) {
            System.out.println("It would be " + chosenType.getCost() + tg);
        } else {
            System.out.println("Wrong choice!");
            yourOrder();
        }
    }

    @Override
    public void paymentProcess() {
        System.out.println("How would you like to pay?");
        System.out.println("Card or cash?");
        String method = scanner.nextLine();
        if (method.equalsIgnoreCase("Card")) {
            System.out.println("Unfortunately it's not working at the moment. Please, choose something else");
            paymentProcess();
        } else if (method.equalsIgnoreCase("Cash")) {
            System.out.println("You gave me " + name.clientCash + tg);
            int change;
            change = name.clientCash - chosenType.getCost();
            System.out.println("Here's your change - " + change + tg);
            System.out.println("Here's your coffee. Good bye.");
        } else {
            System.out.println("You chose the wrong method. Try again.");
            paymentProcess();
        }
    }
}


