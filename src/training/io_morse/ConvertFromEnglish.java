package training.io_morse;

import java.io.*;
import java.util.Scanner;

public class ConvertFromEnglish  {
    private File fromEnglishFile = new File("src/training/io_morse/resource/FromEnglishText");

   public static void writeToFile(String line) throws IOException {
        Scanner scan = new Scanner(System.in);
        String yourSequence;
        yourSequence = scan.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(line));
        writer.write(yourSequence);
        writer.flush();
        writer.close();
    }

    public void writeToEnglish() throws IOException{
        System.out.println("Write your sequence to encrypt: ");
        writeToFile("src/training/io_morse/resource/FromEnglishText");
    }

    public void convertToMorse() throws IOException {
        Scanner scanner = new Scanner(fromEnglishFile);
        String englishTextToChange = "";
        StringBuilder newText = new StringBuilder();

        if (scanner.hasNextLine()) {
            englishTextToChange += scanner.nextLine();
        }

        for (int i = 0; i < englishTextToChange.length(); i++) {
            for (short j = 0; j < 27; j++) {
                if (englishTextToChange.charAt(i) == InitialAlphabet.getEnglishAlphabet()[j]) {
                    newText.append(InitialAlphabet.getMorseAlphabet()[j]);
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/training/io_morse/resource/ToMorse"));
        writer.write(newText.toString());
        writer.flush();
        writer.close();
    }
}