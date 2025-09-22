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
        int answer = 0;
        int stock = Integer.MAX_VALUE;
        int N = read.nextInt();
        
        
        for
        (
            int i = 0
            ; i < N
            ; i ++
        )
        {
            int price = read.nextInt();
            
            if
            (
                stock > price
            )
            {
                stock = price;
            }
            else if
            (
                stock < price
            )
            {
                answer += price - stock;
                stock = price;
            }
            
        }
        
        
        System.out.println( answer );
    }
    
}
