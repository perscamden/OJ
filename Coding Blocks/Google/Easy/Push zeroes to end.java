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
        int zeroes = 0;


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            int num = read.nextInt();

            if
            (
                num > 0
            )
            {
                System.out.print( num + " " );
            }
            else
            {
                zeroes ++;
            }

        }


        for
        (
            int i = 0
            ; i < zeroes
            ; i ++
        )
        {
            System.out.print( "0 " );
        }


    }

}
