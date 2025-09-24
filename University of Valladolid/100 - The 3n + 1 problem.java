import java.util.*;






class Main
{
    static int[] cache = new int[10001];
    
    
    
    
    public static
    void
    main
    (
        String[] args
    )
    {
        Scanner read = new Scanner( System.in );
        int i = read.nextInt();
        int j = read.nextInt();
        
        if
        (
            i > j
        )
        {
            int temp = i;
            i = j;
            j = temp;
        }
        
        int answer = 0;
        
        
        for
        (
            int k = i
            ; k <= j
            ; k ++
        )
        {
            answer = Math.max( answer, solve( k ) );
        }
        
        
        System.out.println( answer );
    }
    
    
    
    
    static   
    int
    solve
    (
        int n
    )
    {
        
        if
        (
            cache[n] > 0
        )
        {
            return cache[n];
        }
        else if
        (
            n < 2
        )
        {
            cache[n] = 1;
        }
        else if
        (
            n % 2 > 0
        )
        {
            cache[n] = 1 + solve( ( 3 * n ) + 1 );
        }
        else
        {
            cache[n] = 1 + solve( n / 2 );
        }
        
        return cache[n];
    }
    
}
