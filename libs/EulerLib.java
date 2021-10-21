
import java.math.BigInteger;

//libary for project euler used in other javafiles
public class EulerLib {

    // returns digitsum of given BI
    public int digitSum(BigInteger bi) {
        String valuesOfBi = bi.toString();
        int sum = 0;
        for (int i = 0; i < valuesOfBi.length(); i++)
            sum += valuesOfBi.charAt(i) - '0';
        return sum;
    }

    // returs the sum of all natural mulitplications of two given values until a set
    // upperbound
    // where int multis are the numbers to me "multiplied" and int upperbound is the
    // the set upperbound
    public int getValuesSummed(int multiOne, int multiTwo, int upperbound) {
        int value = 0;
        for (int i = 1; i < upperbound; i++)
            if (i % multiOne == 0 || i % multiTwo == 0)
                value += i;
        return value;
    }

    // returns sum of all even numbers in fibonacci sequence until 4mio
    public int sumFibonacci() {
        // first 3 values -> 2,8 and 34 -> 44
        int sum = 44;
        int temp1 = 55;
        int temp2 = 89;
        while (temp2 < 4000000) {
            int innerTemp = temp1 + temp2;
            if ((innerTemp) % 2 == 0)
                sum += innerTemp;
            temp1 = temp2;
            temp2 = innerTemp;
        }
        return sum;
    }

    // gets larges prime in given number via checkin isPrime()
    public long getLargesPrimefactor(long number) {
        long highest = 0;
        for (long i = 3; i <= Math.sqrt(number); i += 2)
            if (number % i == 0 && isPrime(i))
                highest = i;

        return highest;
    }

    // returns if given number is prime or not
    public boolean isPrime(long number) {
        for (long i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                return false;

        return true;
    }

    // returns largest palindrom multiplying two 3digit numbers
    public int getLargestPalindrom() {
        int highest = 0;
        int temp = 0;
        for (int one = 999; one >= 100; one--)
            for (int two = 999; two >= 100; two--)
                temp = one * two;
        if (isPalindrom(temp) && temp > highest)
            highest = temp;
        return highest;
    }

    // check if isPalindrom -> true on yes, false on no
    public boolean isPalindrom(int digits) {
        String s = String.valueOf(digits);
        int n = s.length();
        for (int i = 0; i < n / 2; i++)
            if (s.charAt(i) != s.charAt(n - i - 1))
                return false;
        return true;
    }

    // smallest number where % from 1...20 is 0
    public int smallestEvenDivisible() {
        int i = 1;
        while (true) {
            if (i % 11 == 0 && i % 15 == 0 && i % 13 == 0 && i % 14 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0
                    && i % 19 == 0 && i % 20 == 0)
                return i;
            i++;
        }
    }

    // sum of squre until given uperbound and return sum
    public int sumSqr(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++)
            sum += (int) Math.pow(i, 2);
        return sum;
    }

    // sum first, square after, return sum
    public int sumFirstSquareAfter(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;

        return (int) Math.pow(sum, 2);
    }

    // number as string, int x -> number of digits to be multiplied
    public long getSumOf13(char[] number, int x) {
        long result = Long.MIN_VALUE;
        System.out.println(number);
        long tempSum = 1;
        for (int i = 0; i < number.length - x; i++) {
            for (int j = i, count = 0; count < x; j++, count++) {
                tempSum *= Character.getNumericValue(number[j]);
            }
            if (result < tempSum)
                result = tempSum;
            tempSum = 1;

        }
        System.out.println("test");
        return result;
    }

    // needs work ->Euler9
    // a<b<c where sum==1000
    public String getPythTripletBrute() {

        // for(int a = 3; a <=
        return "";
    }

    public int calcMatrix(int[][] matrix, int adjacent) {
        int[][] godPleaseHelp = matrix;
        int highest = 0;
        int temp;
        if (highest < (temp = getDownHighest(godPleaseHelp, 4)))
            highest = temp;
        if (highest < (temp = getRightHighest(godPleaseHelp, 4)))
            highest = temp;
        if (highest < (temp = getDiagonalRightHighest(godPleaseHelp, 4)))
            highest = temp;
        if (highest < (temp = getDiagonalLeftHighest(godPleaseHelp, 4)))
            highest = temp;

        return highest;
    }

    public int getDownHighest(int[][] matrix, int adjacent) {
        int sum = 1;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j; k < adjacent; k++) {
                    sum*= matrix[j][k];
                }
                if (sum > temp) {
                    temp = sum;
                    sum = 1;
                }
            }
        }
        return temp;
    }

    public int getRightHighest(int[][] matrix, int adjacent) {
        int sum = 1;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - adjacent; j++) {
                for (int k = j; k < adjacent; k++) {
                    sum *= matrix[i][k];
                }
                if (sum > temp) {
                    temp = sum;
                    sum = 1;
                }
            }
        }
        return temp;
    }

    public int getDiagonalRightHighest(int[][] matrix, int adjacent) {
        int sum = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for(int k = j; k < adjacent; k++) {

                }
            }
        }
        return sum;
    }

    public int getDiagonalLeftHighest(int[][] matrix, int adjacent) {
        int sum = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }
        return sum;
    }

    public long collatzSequence(long n) {
        if(n==1)
            return 1;
        else if(n%2==0)
            return collatzSequence(n/2) + 1;
        else
            return collatzSequence(n*3+1) + 1;
    }


}
