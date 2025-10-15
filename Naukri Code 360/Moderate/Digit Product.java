import java.util.*;





public class Solution
{

    public static
    int
    digitProduct
    (
        int n
    )
    {
        ArrayList < Integer > arrayList = new ArrayList <> ();
        int d = 9;


        while
        (
            n > 1
            && d > 1
        )
        {

            if
            (
                n % d == 0
            )
            {
                arrayList.add( d );
                n /= d;
            }
            else
            {
                d --;
            }

        }

        
        if
        (
            n > 9
        )
        {
            return -1;
        }

        arrayList.sort( Comparator.naturalOrder() );
        int ans = 0;


        for
        (
            int i
            : arrayList
        )
        {
            ans = ( ans * 10 ) + i;
        }


        return ans;
    }

}
