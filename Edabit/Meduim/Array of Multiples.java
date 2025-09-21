public class Program
{
    
    public static
    int[]
    arrayOfMultiples
    (
        int num
        , int length
    )
    {
        int[] answer = new int[length];
        int multiple = num;
        
        
        for
        (
            int i = 0
            ; i < length
            ; i ++
        )
        {
            answer[i] = multiple;
            multiple += num;
        }
        
        
        return answer;
    }
    
}
