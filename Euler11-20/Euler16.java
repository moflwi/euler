import java.math.BigInteger;

public class Euler16 {
    public static void main(String[] args) {
        EulerLib eulerLib = new EulerLib();
        long startTime = System.currentTimeMillis();
        BigInteger bigInteger = BigInteger.valueOf(2);
        bigInteger = bigInteger.pow(1000);
        System.out.println(eulerLib.digitSum(bigInteger));
        System.out.println("finished in: " + (System.currentTimeMillis()-startTime) + "ms");
    }

}