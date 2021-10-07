public class EulerTen {
    public static void main(String[] args) {
        EulerLib eulerLib = new EulerLib();
        long sum = 0;
        for(int i = 2; i < 2000000; i++) 
            if(eulerLib.isPrime(i))
                sum+=i;
        System.out.println(sum);
    }
}
