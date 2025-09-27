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
        int t = read.nextInt();
        
        
        for
        (
            int i = 0
            ; i < t
            ; i ++
        )
        {
            long n = read.nextInt();
            
            System.out.println( ( n * ( n - 1 ) ) / 2 );
        }
        
        
    }
    
}
