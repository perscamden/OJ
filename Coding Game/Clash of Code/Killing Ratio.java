class Solution
{

    public static
    void
    main
    (
        String args[]
    )
    {
        Scanner in = new Scanner( System.in );
        int G = in.nextInt();
        double ratio = 0;

        
        for
        (
            int i = 0
            ; i < G
            ; i ++
        )
        {
            int K = in.nextInt();
            int D = in.nextInt();
            ratio += ( ( double ) ( K ) ) / Math.max( 1, D );
        }

        
        ratio /= G;
        DecimalFormat decFormat = new DecimalFormat( "0.##" );
        String grade;

        if
        (
            ratio < 1.0
        )
        {
            grade = "Negative";
        }
        else
        {
            grade = "Positive";
        }

        System.out.println( decFormat.format( ratio ) + " " + grade );
    }
}
