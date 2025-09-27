import java.util.*;






public class Solution
{
    
	public static
	int
	slotScore
	(
		String original
		, String guess
	)
	{
		HashSet < Character > hashSet1 = new HashSet <> ();
		HashSet < Character > hashSet2 = new HashSet <> ();
		int answer = 0;
        
        
		for
		(
			int i = 0
			; i < 4
			; i ++
		)
		{
            
			if
			(
				original.charAt( i ) == guess.charAt( i )
			)
			{
				answer += 2;
			}
			else
			{
				hashSet1.add( original.charAt( i ) );
				hashSet2.add( guess.charAt( i ) );
			}
            
		}
        
        
		hashSet1.retainAll( hashSet2 );
		answer += hashSet1.size();
        
        
		return answer;
	}
    
}