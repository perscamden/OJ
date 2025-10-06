import java.util.*;






public class Solution
{

    public static
    boolean
    identicalSentences
    (
        ArrayList < String > word1
        , ArrayList < String > word2
        , ArrayList < ArrayList < String > > pairs
        , int n
        , int m
        , int p
    )
    {

        if
        (
            m != n
        )
        {
            return false;
        }

        ArrayList < HashSet < String > > hashSetList = new ArrayList <> ();
        HashMap < String, Integer > hashMap = new HashMap <> ();


        for
        (
            ArrayList < String > pair
            : pairs
        )
        {
            int g = hashMap.getOrDefault( pair.get( 0 ), -1 );
            int h = hashMap.getOrDefault( pair.get( 1 ), -1 );

            if
            (
                g < 0
            )
            {

                if
                (
                    h < 0
                )
                {
                    hashMap.put( pair( 0 ), hashSetList.size() );
                    hashMap.put( pair( 1 ), hashSetList.size() );
                    HashSet < String > hashSet = new HashSet <> ();
                    hashSet.addAll( pair );
                    hashSetList.add( hashSet );
                }
                else
                {
                    hashMap.put( pair( 0 ), h );
                    hashSetList.get( h ).add( pair.get( 0 ) );
                }

            }
            else if
            (
                h < 0
            )
            {
                hashMap.put( pair( 1 ), g );
                hashSetList.get( g ).add( pair.get( 1 ) );
            }
            else if
            (
                g < h
            )
            {


                for
                (
                    String word
                    : hashSetList.remove( h )
                )
                {
                    hashMap.put( word, g );
                    hashSetList.get( g ).add( word );
                }
                

            }
            else if
            (
                g > h
            )
            {

                
                for
                (
                    String word
                    : hashSetList.remove( g )
                )
                {
                    hashMap.put( word, h );
                    hashSetList.get( h ).add( word );
                }


            }

        }


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            int g = hashMap.getOrDefault( word1.get( i ), -1 );
            int h = hashMap.getOrDefault( word2.get( i ), -1 );
            
            if
            (
                g == h
                ||
                (
                    g < 0
                    && h < 0
                    && word1.get( i ).equals( word2.get( i ) )
                )

            )
            {
                continue;
            }
            
        }
    }

}
