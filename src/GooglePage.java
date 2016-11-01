import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GooglePage {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://google.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine())!= null) {
            stringBuilder.append(line + System.lineSeparator());
        }
        reader.close();

        String result = stringBuilder.toString()
                .replaceAll("google", "yandex")
                .replaceAll("Google", "Yandex");
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("D://Games//google.txt"), StandardCharsets.UTF_8))){
            writer.write(result);
        }
        System.out.println("Ok" + result);
    }
}
