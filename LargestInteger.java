 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int highestInteger = 0;
        for (int counter = 0; counter < integers.length; counter++)
        {
            if (integers[counter] > highestInteger)
            {
                highestInteger = integers[counter];
            }
        }
        return highestInteger;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        
        return Math.max(integers[0],integers[2]);
        
    }
}
