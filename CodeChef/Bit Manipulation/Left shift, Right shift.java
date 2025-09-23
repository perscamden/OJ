import java.util.*;






class Solution
{
    
    public static
    void
    main
    (
        String[] args
    )
    {
        Scanner read = new Scanner( System.in );
        int n = read.nextInt();
        int l = read.nextInt();
        int r = read.nextInt();
        
        
        System.out.println( ( n >> l ) << r );
    }
    
}
