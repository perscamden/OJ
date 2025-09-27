public class Challenge
{
    
    public static
    int
    triangle
    (
        int n
    )
    {
        int answer = 0;
        
        
        for
        (
            int i = 1
            ; i <= n
            ; i ++
        )
        {
            answer += i;
        }
        
        return answer;
    }
    
}
