import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromConsole {

    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        String line;
        boolean parsed;

        while (!(line = reader.readLine()).equals("q")) {
            try {
                //doubles.add(Double.valueOf(line));
            } catch (NumberFormatException e) {
                try {
                    integers.add(Integer.valueOf(line));
                } catch (NumberFormatException e1) {
                    strings.add(line);
                }
            }
        }
        reader.close();
    }
}
