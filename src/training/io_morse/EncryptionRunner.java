package training.io_morse;

import java.io.IOException;

public class EncryptionRunner {
    public static void main (String[] args) throws IOException {
        ConvertFromEnglish converter = new ConvertFromEnglish();
        converter.writeToEnglish();
        converter.convertToMorse();
    }
}
