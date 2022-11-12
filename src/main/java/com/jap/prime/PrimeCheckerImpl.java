package com.jap.prime;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker primeChecker=(num) ->
        {
            boolean flag=true;
            for(int i=2;i<=num/2;++i)
            {
                if(num % 2==0)
                {
                    flag=false;
                    break;
                }
            }
            return flag;
        };
        return primeChecker.isPrimeNumber(number);
    }

    public static void main(String[] args) {
        PrimeCheckerImpl primeChecker=new PrimeCheckerImpl();
        boolean result = primeChecker.primeNumberCheck(11);
        System.out.println("result = " + result);
    }

}
