package training.starbucks;

import java.util.Scanner;

public class Worker implements WorkerRule {
    private Scanner scanner = new Scanner(System.in);
    private Client clientName = new Client();
    private CoffeeType chosenCoffeeType;
    private String tenge = " tenge";

    @Override
    public void greetings() {
        System.out.println("Hello! I'm Alice! Welcome to Starbucks! What is your name?");
        clientName.setClientName(scanner.nextLine());
        System.out.println("Please " + clientName.getClientName() + " make your order.");
        for(CoffeeType coffee : CoffeeType.values())
            if(coffee != CoffeeType.WRONG) {
                System.out.println("Available coffee options: " + coffee);
            }
    }

    @Override
    public void yourOrder() {
        System.out.println("I would like to order ");
        String yourChoice = scanner.nextLine();
        chosenCoffeeType = CoffeeType.findByName(yourChoice);
        if (chosenCoffeeType != CoffeeType.WRONG) {
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
            System.out.println("You gave me " + clientName.getClientCash() + tenge);
            int change;
            change = clientName.getClientCash() - chosenCoffeeType.getCoffeeCost();
            System.out.println("Here's your change - " + change + tenge);
            System.out.println("Here's your coffee. Good bye.");
        } else {
            System.out.println("You chose the wrong method. Try again.");
            paymentProcess();
        }
    }
}