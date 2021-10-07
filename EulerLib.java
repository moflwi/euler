import java.math.BigInteger;
//libary for project euler used in other javafiles
public class EulerLib {

    //returns digitsum of given BI
    public int digitSum(BigInteger bi) {
        String valuesOfBi = bi.toString();
        int sum = 0;
        for(int i = 0; i < valuesOfBi.length(); i++)
            sum += valuesOfBi.charAt(i)-'0'; 
        return sum;
    }

    //returs the sum of all natural mulitplications of two given values until a set upperbound
    //where int multis are the numbers to me "multiplied" and int upperbound is the the set upperbound
    public int getValuesSummed(int multiOne,int multiTwo, int upperbound) {
        int value = 0;
        for(int i = 1; i < upperbound; i++)  
            if(i % multiOne == 0 || i % multiTwo == 0) 
                value+=i;
        return value;
    }






}
