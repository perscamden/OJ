import java.util.* ;






public class Solution
{
    
	public static
	int
	copyBitsInRange
	(
		int a
		, int b
		, int x
		, int y
	)
	{
		
		
		for
		(
			int i = x - 1
			; i < y
			; i ++
		)
		{
			b |= ( a & ( 1 << i ) );
		}


		return b;
	}
    
}
