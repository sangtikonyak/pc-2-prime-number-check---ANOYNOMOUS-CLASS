package com.jap.prime;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        PrimeChecker primeChecker=(num) ->
        {
            boolean flag=true;
            for(int i=2;i<=num/2;++i)
            {
               if(num % i==0)
               {
                   flag=false;
                   break;
               }
            }
            if(num==0 || num==1)
            {
                flag=false;
            }

            return flag;
        };
        return primeChecker.isPrimeNumber(number);
    }

    public static void main(String[] args) {
        PrimeCheckerImpl primeChecker=new PrimeCheckerImpl();
        boolean result = primeChecker.primeNumberCheck(1);
        System.out.println("result = " + result);
    }

}
