public class Challenge
{
    
    public static
    String
    sevenBoom
    (
        int[] arr
    )
    {
        
        
        for
        (
            int num
            : arr
        )
        {
            
            
            while
            (
                num > 0
            )
            {
                
                if
                (
                    num % 10 == 7
                )
                {
                    return "Boom!";
                }
                
                num /= 10;
            }
        
        
        }
        
        
        return "there is no 7 in the array";
    }
    
}
