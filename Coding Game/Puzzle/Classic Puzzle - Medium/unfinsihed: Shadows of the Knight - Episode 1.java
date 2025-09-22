import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player
{

    public static
    void
    main
    (
        String args[]
    )
    {
        Scanner in = new Scanner( System.in );
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int x = X0;
        int y = Y0;
        int hiX = H - 1;
        int hiY = W - 1;
        int lowX = 0;
        int lowY = 0;
        
        
        // game loop
        while
        (
            true
        )
        {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            
            switch ( bombDir.charAt( 0 ) )
            {

                case 'U':
                    hiX = x;
                    x = ( x + lowX ) / 2;

                case 'D':
                    x = ( x + hiX + 1 ) / 2;

                case 'R':
                    y = ( y + hiY + 1 ) / 2;

                case 'L':
                    y = ( y + lowY ) / 2;

            }


            if
            (
                bombDir.length() > 1
            )
            {

                if
                (
                    bombDir.charAt( 1 ) == 'R'
                )
                {
                    y = ( y + hiY + 1 ) / 2;
                }
                else
                {
                    y = ( y + lowY ) / 2;
                }

            }
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // the location of the next window Batman should jump to.
            System.out.println( x + " " + y );
        }


    }

}
