import java.math.BigInteger;

public class EulerLog {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BigInteger bigInteger = BigInteger.valueOf(2);
        bigInteger = bigInteger.pow(1000);
        System.out.println(digitSum(bigInteger));
        System.out.println("finished in: " + (System.currentTimeMillis()-startTime) + "ms");
    }


    private static int digitSum(BigInteger bi) {
        String valuesOfBi = bi.toString();
        int sum = 0;
        for(int i = 0; i < valuesOfBi.length(); i++)
            sum += valuesOfBi.charAt(i)-'0'; 
        return sum;
    }

}