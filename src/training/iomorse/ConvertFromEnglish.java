package training.iomorse;

import java.io.*;
import java.util.Scanner;

public class ConvertFromEnglish  {

    private File toMorseFile = new File("src/training/iomorse/resource/FromEnglishText");

    static void writeToFile(String s) throws IOException {
        Scanner scan = new Scanner(System.in);
        String yourEnglishSequence;
        yourEnglishSequence = scan.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(s));
        writer.write(yourEnglishSequence);
        writer.flush();
        writer.close();
    }

    public void writeToEnglish() throws IOException{
        System.out.println("Write your sequence to encrypt: ");
        writeToFile("src/training/iomorse/resource/FromEnglishText");
    }

    public void convertToMorse() throws IOException {
        Scanner scanner = new Scanner(toMorseFile);
        String engTextToChange = "";
        StringBuilder newText = new StringBuilder();

            if(scanner.hasNextLine()){
                engTextToChange += scanner.nextLine();
            }
            else {
                System.out.println("You ");
            }

        for (int i = 0; i < engTextToChange.length(); i++) {
            for (short j = 0; j < 27; j++) {
                if (engTextToChange.charAt(i) == Alphabet.getEnglishAlphabet()[j]) {
                    newText.append(Alphabet.getMorseAlphabet()[j]);
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/training/iomorse/resource/ToMorse"));
        writer.write(newText.toString());
        writer.flush();
        writer.close();
    }
}