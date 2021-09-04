public class SumIntList {
    /* Method
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum() { //(List<Integer> ar)
    
        Integer []ar = {1,2,3}; 

        Integer sum =0;
        for(Integer i : ar){
             sum +=i;
        }
        return  sum;  
        }
}
     
