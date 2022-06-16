import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class CharEncoding {
    public static void main(String[] args) {

        Charset charset = Charset.forName(args[0]);
        String filePath = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(filePath, charset))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
