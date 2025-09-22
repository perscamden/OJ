// Run Time Error
class Solution
{
    
    public
    long
    flipBits
    (
        long n
    )
    {
        return ( n - Long.highestOneBit( n ) ) ^ 1L;
    }
    
}
