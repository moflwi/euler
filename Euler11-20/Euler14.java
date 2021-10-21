public class Euler14 {
    public static void main(String[] args) {
        long max = 0;
        long temp = 0;
        long number = 0;
        EulerLib eulerLib = new EulerLib();
        for(long i = 1; i < 1000000; i++) {
            temp = eulerLib.collatzSequence(i);
            if(temp>max) {
                max=temp;
                number = i;
            }
        }
        System.out.println(number);
    }
    
}
