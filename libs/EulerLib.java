
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

    //returns sum of all even numbers in fibonacci sequence until 4mio
    public int sumFibonacci() {
        //first 3 values -> 2,8 and 34 -> 44
        int sum = 44;
        int temp1 = 55;
        int temp2 = 89;
        while(temp2 < 4000000) {
            int innerTemp = temp1+temp2;
            if((innerTemp) % 2 == 0)  
                sum+= innerTemp;
            temp1 = temp2;
            temp2 = innerTemp;
        }
        return sum;
    }


    //gets larges prime in given number via checkin isPrime()
    public long getLargesPrimefactor(long number) {
        long highest = 0;
        for(long i = 3; i <= Math.sqrt(number); i+=2) 
            if(number % i == 0 && isPrime(i))
                highest = i;      
        return highest;
    }


    //returns if given number is prime or not
    public boolean isPrime(long number) {
        
        for(long i = 3; i <= Math.sqrt(number); i+=2) 
            if(number % i == 0) 
                return false;
        return true;
    }






}
