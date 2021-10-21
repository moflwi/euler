import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler13 {
    public static void main(String[] args) throws IOException {
        long sum = 0;
        BufferedReader csvReader = new BufferedReader(new FileReader("digits.csv"));
        String row ="";
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\n");
            for(char c : data[0].toCharArray())
                sum+= c - '0';
        }
        csvReader.close();

        System.out.println(sum);
    }
}   