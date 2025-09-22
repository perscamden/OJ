import java.util.*;






class Solution
{
    
    public
    int
    mysteryFunction
    (
        int a
        , int b
    )
    {
        
        if
        (
            b < 1
        )
        {
            return a;
        }
        else
        {
            return mysteryFunction( b, a % b );
        }
        
    }
    
}
