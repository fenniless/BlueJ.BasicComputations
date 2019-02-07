 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger result = new BigInteger("1");
        
        int n = value;
        for (int i = 2 ; i <= n ; i++ )
        
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }

}
