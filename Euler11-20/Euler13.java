import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Euler13 {
    public static void main(String[] args) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("libs\\digits.csv"));
        String row ="";
        BigInteger sum = BigInteger.ZERO;
        while ((row = csvReader.readLine()) != null) 
            sum = sum.add(new BigInteger(row));
        csvReader.close();       
        System.out.println(sum.toString().substring(0, 10));
    }
}   