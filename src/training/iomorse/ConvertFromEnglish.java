package training.iomorse;

import java.io.*;
import java.util.Scanner;

public class ConvertFromEnglish  {
    private File toMorseFile = new File("src/training/iomorse/resource/FromEnglishText");

   public static void writeToFile(String s) throws IOException {
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

        for (int i = 0; i < engTextToChange.length(); i++) {
            for (short j = 0; j < 27; j++) {
                if (engTextToChange.charAt(i) == InitialAlphabet.getEnglishAlphabet()[j]) {
                    newText.append(InitialAlphabet.getMorseAlphabet()[j]);
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/training/iomorse/resource/ToMorse"));
        writer.write(newText.toString());
        writer.flush();
        writer.close();
    }
}