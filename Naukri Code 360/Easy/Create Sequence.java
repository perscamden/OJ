import java.util.*;






public class Solution
{

    public static
    ArrayList < Long > createSequence
    (
        long n
    )
    {
        ArrayList < Long > answer = new ArrayList <> ();
        StringBuilder s = new StringBuilder();
        s.append( '2' );
        Long num = Long.valueOf( s.toString() );


        while
        (
            num <= n
        )
        {
            answer.add( num );
            boolean t = true;


            for
            (
                int i = s.length() - 1
                ; i >= 0
                ; i --
            )
            {

                if
                (
                    s.charAt( i ) == '2'
                )
                {
                    s.setCharAt( i, '5' );
                    t = false;

                    break;
                }
                else
                {
                    s.setCharAt( i, '2' );
                }

            }


            if
            (
                t
            )
            {
                s.append( '2' );
            }

            num = Long.valueOf( s.toString() );
        }


        return answer;
    }

}
