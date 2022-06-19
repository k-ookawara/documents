import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePath {
    public static void main(String[] args) {

        // これはWindowsのみ
        File windowsFile = new File("C:\\Users\\saito\\Desktop\\sample.txt");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(windowsFile), StandardCharsets.UTF_8))) {
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Windows、Unixともに可
        File unixFile = new File("/Users/saito/Desktop/sample.txt");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(unixFile), StandardCharsets.UTF_8))) {
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Java7以降はjava.nio.fileパッケージを使おう
        Path relativePath = Path.of("/Users/saito/Desktop/sample.txt");
        try (BufferedReader br = Files.newBufferedReader(relativePath, StandardCharsets.UTF_8)) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // クラスパスからパス指定することも
        try {
            Path classPathFile = Path.of(FilePath.class.getClassLoader().getResource("sample.txt").toURI());
            try (BufferedReader br = Files.newBufferedReader(classPathFile, StandardCharsets.UTF_8)) {
                System.out.println(br.readLine());
            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
