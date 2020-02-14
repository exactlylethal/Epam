package training.iomorse;

public class InitialAlphabet {
    private static final char[] ENGLISH_ALPHABET = {
            ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static final String [] MORSE_ALPHABET = {" ", ".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
            "-..-", "-.--", "--.."};

    public static char[] getEnglishAlphabet() {
        return ENGLISH_ALPHABET;
    }

    public static String[] getMorseAlphabet() {
        return MORSE_ALPHABET;
    }
}

