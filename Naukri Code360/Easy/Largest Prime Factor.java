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
        int answer = -1;
        int i = 2;
        
        
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
            }
            else
            {
                i ++;
            }
        
        }
        
        
        return answer;
    }
    
}
