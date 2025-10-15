import java.util.*;






public class Solution
{
    static final HashMap < Integer, HashSet < Double > > cache = new HashMap <> ();




    public
    static
    Boolean
    judge
    (
        int[] nums
    )
    {
        
        
        for
        (
            int p = 0
            ; p < nums.length
            ; p ++
        )
        {


            for
            (
                int q = 0
                ; q < nums.length
                ; q ++
            )
            {

                if
                (
                    q == p
                )
                {
                    continue;
                }


                for
                (
                    int r = 0
                    ; r < nums.length
                    ; r ++
                )
                {

                    if
                    (
                        r == p
                        || r == q
                    )
                    {
                        continue;
                    }


                    for
                    (
                        int s = 0
                        ; s < nums.length
                        ; s ++
                    )
                    {

                        if
                        (
                            s == p
                            || s == q
                            || s == r
                        )
                        {
                            continue;
                        }
                        else
                        {
                            int num = ( nums[p] * 1000 )
                                + ( nums[q] * 100 )
                                + ( nums[r] * 10 )
                                + nums[s];

                            HashSet < Double > hashSet = getHashSet( num );
                            

                            for
                            (
                                Double d
                                : hashSet
                            )
                            {
                                
                                if
                                (
                                    Math.abs( d - 24 ) < 0.000001
                                )
                                {
                                    return true;
                                }

                            }


                        }

                    }


                }


            }


        }


        return false;
    }




    static
    HashSet < Double >
    getHashSet
    (
        int num
    )
    {

        if
        (
            cache.get( num ) != null
        )
        {
            return cache.get( num );
        }

        cache.put( num, new HashSet <> () );

        if
        (
            num < 10
        )
        {
            cache.get( num ).add( Double.valueOf( num ) );


            return cache.get( num );
        }


        int d = 10;


        while
        (
            d < num
        )
        {
            HashSet < Double > hashSet1 = getHashSet( num / d );
            HashSet < Double > hashSet2 = getHashSet( num % d );

            for
            (
                Double d1
                : hashSet1
            )
            {


                for
                (
                    double d2
                    : hashSet2
                )
                {
                    cache.get( num ).add( d1 + d2 );
                    cache.get( num ).add( d1 - d2 );
                    cache.get( num ).add( d2 - d1 );
                    cache.get( num ).add( d1 * d2 );
                    cache.get( num ).add( d1 / d2 );
                    cache.get( num ).add( d2 / d1 );
                }


            }


            d *= 10;
        }


        return cache.get( num );
    }

}
