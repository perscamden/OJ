import java.util.*;






public class Solution
{
    
    public static
    int
    maximumSwap
    (
        int n
    )
    {
        StringBuilder s = new StringBuilder();


        for
        (
            char ch
            : Integer.toString( n ).toCharArray()
        )
        {
            s.append( ch );
        }


        int o = s.length() - 1;


        for
        (
            int i = 0
            ; i < o
            ; i ++
        )
        {
            int max = i;


            for
            (
                int j = o
                ; j > i
                ; j --
            )
            {

                if
                (
                    s.charAt( j ) > s.charAt( max )
                )
                {
                    max = j;
                }

            }


            if
            (
                i < max
            )
            {
                char ch = s.charAt( i );
                s.setCharAt( i, s.charAt( max ) );
                s.setCharAt( max, ch );


                return Integer.valueOf( s.toString() );
            }

        }


        return n;
    }
    
}
