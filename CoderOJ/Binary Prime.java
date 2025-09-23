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
        int T = read.nextInt();
        
        
        for
        (
            int i = 0
            ; i < T
            ; i ++
        )
        {
            long N = read.nextLong();
            int bits = Long.bitCount( N );
            boolean isPrime = bits > 1;
            
            
            for
            (
                long j = 2
                ; j < bits
                ; j ++
            )
            {
            
                if
                (
                    bits % j == 0
                )
                {
                    isPrime = false;
                    
                    break;
                }
                
            }
            
            if
            (
                isPrime
            )
            {
                System.out.println( "Binary prime" );
            }
            else
            {
                System.out.println( -1 );
            }
            
        }
        
        
    }
    
}
