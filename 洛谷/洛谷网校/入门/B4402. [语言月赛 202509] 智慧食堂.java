import java.util.*;






class Main
{
    
    public static
    void
    main
    (
        String[] args
    )
    {
        Scanner read = new Scanner( System.in );
        int sum = 0;
        
        
        for
        (
            int i = 0
            ; i < 3
            ; i ++
        )
        {
            sum += read.nextInt();
        }
        
        
        int op = read.nextInt();
        
        if
        (
            op < 2
        )
        {
            System.out.println( sum );
        }
        else   
        {
            System.out.println( "Fail to pay." );
        }
        
    }
    
}
