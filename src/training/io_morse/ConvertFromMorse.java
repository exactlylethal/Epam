package training.io_morse;

import java.io.*;
import java.util.Scanner;

public class ConvertFromMorse {
    private File fromMorseFile = new File("src/training/io_morse/resource/FromMorseText");

    public void writeToMorse() throws IOException {
        System.out.println("Write your sequence to decrypt: ");
        ConvertFromEnglish.writeToFile("src/training/io_morse/resource/FromMorseText");
    }

    public void convertFromMorse() throws IOException {
        Scanner scanner = new Scanner(fromMorseFile);
        String morseTextToChange = "";
        StringBuilder newText = new StringBuilder();

        if (scanner.hasNextLine()) {
            morseTextToChange += scanner.nextLine();
        }

            for(String result : morseTextToChange.split("\\s")){
                for(short j = 0; j < 27; j++){
                    if(result.equals(InitialAlphabet.getMorseAlphabet()[j])){
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




