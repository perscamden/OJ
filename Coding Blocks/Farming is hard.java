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
		int n = read.nextInt();
		int m =  n - 1;
		int q = read.nextInt();
		TreeMap < Integer, Integer > patches = new TreeMap <> ();
		int crops = 0;


		for
		(
			int i = 0
			; i < q
			; i ++
		)
		{
			int type = read.nextInt();

			if
			(
				type == 1
			)
			{
				int idx = read.nextInt();
				int tol = read.nextInt();
				patches.put( idx, tol );
			}
			else
			{
				int l = read.nextInt();
				int r = read.nextInt();
				int pow = read.nextInt();


				while
				(
					l <= r
				)
				{
					Map.Entry < Integer, Integer > patch = patches.ceilingEntry( l );

					if
					(
						patch == null
						|| patch.getKey() > r
					)
					{
						break;
					}
					else
					{
						l = patch.getKey() + 1;
						
						if
						(
							patch.getValue() < pow
						)
						{
							patches.remove( l - 1 );
						}
						
					}
					
				}


			}
			

			System.out.print( patches.size() + " " );
		}


    }

}
