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
            int answer = 0;
            
            
            for
            (
                int j = 0
                ; j < 3
                ; j ++
            )
            {
                answer = Math.max( answer, read.nextInt() );
            }
            
            
            System.out.println( answer );
        }
        
        
    }
    
}
