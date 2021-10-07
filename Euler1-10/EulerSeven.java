public class EulerSeven {
    public static void main(String[] args) {
        EulerLib eulerLib = new EulerLib();
        int count = 6;
        int currentNumber = 14;
        while(count<10001) {
            if(eulerLib.isPrime(currentNumber)) 
                count++;
            currentNumber++;
        }
        System.out.println(currentNumber-1);
    }
    
}
