import java.util.*;





public class Solution
{
    
    public static
    int
    largestPrimeFactor
    (
        int n
    )
    {
        
        if
        (
            n % 2 < 1
        )
        {
            n /= 2;
            
            
            while
            (
                n % 2 < 1
            )
            {
                n /= 2;
            }
            
            
            if
            (
                n < 2
            )
            {
                return 2;
            }
        
        }
        
        
        int answer = 2;
        int i = 3;
        
        
        while
        (
            i <= n
        )
        {
            
            if
            (
                n % i < 1
            )
            {
                answer = i;
                n /= i;
                
                
                while
                (
                    n % i < 1
                )
                {
                    n /= i;
                }
                
                
            }
            else
            {
                i += 2;
            }
            
        }
        
       return answer; 
        // if
        // (
        //     answer == 2
        // )
        // {
        //     return n;
        // }
        // else
        // {
        //     return answer;
        // }
        
    }
    
}
