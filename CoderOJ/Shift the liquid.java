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
        double A = read.nextDouble();
        int B = read.nextInt();
        
        
        System.out.println( ( int ) ( Math.ceil(  A / B ) ) );
    }
    
}
