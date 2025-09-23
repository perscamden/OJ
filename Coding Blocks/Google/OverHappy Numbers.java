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
		HashSet < Integer > hashSet = new HashSet <> ();
		int n = read.nextInt();
		int sum = 0;
        int m = 0;
        
        
		while
		(
			n > 1
		)
		{
			hashSet.add( n );
			sum = 0;
            
            
			while
			(
				n > 0
			)
			{
                m = n % 10;
				sum += m * m;
				n /= 10;
			}
            
            
			n = sum;
            
			if
			(
				hashSet.contains( n )
			)
			{
				break;
			}
            
		}
        
        
		System.out.println( n == 1 );
    }
    
}
