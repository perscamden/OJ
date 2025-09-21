public class Challenge
{
    
    public static
    int
    countTrue
    (
        boolean[] arr
    )
    {
        int answer = 0;
            
        for
        (
            boolean bool
            : arr
        )
        {
            
            if
            (
                bool
            )
            {
                answer ++;
            }
            
        }
        
        
        return answer;
    }
    
}
