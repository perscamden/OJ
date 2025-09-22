public static
boolean
check
(
    int[] nums
)
{
    int[] arr = nums.clone();
    Arrays.sort( arr );
    int n = arr.length;
    int j = 0;
    
    
    for
    (
        int i = 0
        ; i < n
        ; i ++
    )
    {
        
        if
        (
            arr[0] == nums[i]
        )
        {
            j = i;
            
            break;
        }
        
    }
    
    
    for
    (
        int i = 0
        ; i < n
        ; i ++
    )
    {
        
        if
        (
            arr[i] != nums[j]
        )
        {
            return false;
        }
        
        j = ( j + 1 ) % n;
    }
    
    
    return true;
}
