import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
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
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        int x = initialTx;
        int y = initialTy;
        
        
        // game loop
        while
        (
            true
        )
        {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            StringBuilder move = new StringBuilder();
            
            if
            (
                lightY > y
            )
            {
                move.append( 'S' );
                y ++;
            }
            else if
            (
                lightY < y
            )
            {
                move.append( 'N' );
                y --;
            }
            
            if
            (
                lightX > x
            )
            {
                move.append( 'E' );
                x ++;
            }
            else if
            (
                lightX < x
            )
            {
                move.append( 'W' );
                x --;
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            
            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println( move.toString() );
        }
        
        
    }
    
}
