package training.io_morse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConvertFromMorse {
    private File toEnglishFile = new File("src/training/io_morse/resource/FromMorseText");

    public void writeToMorse() throws IOException {
        System.out.println("Write your sequence to decrypt: ");
        ConvertFromEnglish.writeToFile("src/training/io_morse/resource/FromMorseText");
    }

    public void convertFromMorse() throws IOException {
        Scanner scanner = new Scanner(toEnglishFile);
        String morseTextToChange = "";
        StringBuilder newText = new StringBuilder();

        if (scanner.hasNextLine()) {
            morseTextToChange += scanner.nextLine();
        }

        for(String split : morseTextToChange.split("\\s")){
            for(short j = 0; j < 27; j++){
                if(split.equals(InitialAlphabet.getMorseAlphabet()[j])){
                    newText.append(InitialAlphabet.getEnglishAlphabet()[j]);
                }
            }
    }

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/training/io_morse/resource/ToEnglish"));
        writer.write(newText.toString());
        writer.flush();
        writer.close();
    }
}




