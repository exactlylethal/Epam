package training.io_morse;

import java.io.IOException;
import java.util.Scanner;

public class Choice {

    public void convertType() throws IOException {
        ConvertFromEnglish firstConverter = new ConvertFromEnglish();
        ConvertFromMorse secondConverter = new ConvertFromMorse();

        System.out.println("Available options: ");
        System.out.println("Encode from file, Encode from console");
        System.out.println("Decode from file, Decode from console");

        Scanner scanner = new Scanner(System.in);
        String yourChoice;
        yourChoice = scanner.nextLine();

        if(yourChoice.equalsIgnoreCase("Encode from file")){
            firstConverter.convertToMorse();
        }

        else if(yourChoice.equalsIgnoreCase("Encode from console")){
            firstConverter.writeToEnglish();
            firstConverter.convertToMorse();
        }

        else if(yourChoice.equalsIgnoreCase("Decode from file")){
            secondConverter.convertFromMorse();
        }

        else if(yourChoice.equalsIgnoreCase("Decode from console")){
            secondConverter.writeToMorse();
            secondConverter.convertFromMorse();
        }

        else{
            System.out.println("You made a mistake. Try again");
            convertType();
        }
    }
}