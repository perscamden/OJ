import java.util.*;






public class Main
{
    
    public static
    void
    main
    (
        String args[]
    )
    {
        Scanner read = new Scanner( System.in );
        int n = read.nextInt();
        int k = read.nextInt();
        int o = n - k;
        int[] nums = new int[n];
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            nums[i] = read.nextInt();
        }
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            System.out.print( nums[( i + o ) % n] + " " );
        }
        
        
    }
    
}
