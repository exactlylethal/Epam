package _java._se._starbucks;

import java.util.Arrays;
import java.util.Scanner;

public class Worker implements WorkerRule {
    private Scanner scanner = new Scanner(System.in);
    private Client name = new Client();
    private CoffeeType chosenCoffeeType;
    private String tenge = " tenge";

    @Override
    public void greetings() {
        System.out.println("Hello! I'm Alice! Welcome to Starbucks! What is your name?");
        name.setClientName(scanner.nextLine());
        System.out.println("Please " + name.getClientName() + " make your order.");
        System.out.println("Available coffee options: " + Arrays.asList(CoffeeType.values()));
    }

    @Override
    public void yourOrder() {
        System.out.println("I would like to order ");
        String yourChoice = scanner.nextLine();
        chosenCoffeeType = CoffeeType.findByName(yourChoice);
        if (chosenCoffeeType != null) {
            System.out.println("It would be " + chosenCoffeeType.getCoffeeCost() + tenge);
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
            System.out.println("You gave me " + name.getClientCash() + tenge);
            int change;
            change = name.getClientCash() - chosenCoffeeType.getCoffeeCost();
            System.out.println("Here's your change - " + change + tenge);
            System.out.println("Here's your coffee. Good bye.");
        } else {
            System.out.println("You chose the wrong method. Try again.");
            paymentProcess();
        }
    }
}