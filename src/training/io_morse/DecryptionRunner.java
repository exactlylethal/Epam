package training.io_morse;

import java.io.IOException;

public class DecryptionRunner {
    public static void main(String[] args) throws IOException {
    ConvertFromMorse con = new ConvertFromMorse();
    con.writeToMorse();
    con.convertFromMorse();
    }
}
