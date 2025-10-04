/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

public class Solution
{
    
    public static
    int
    kthSmallest
    (
        TreeNode root
        , int k
    )
    {
        int[] arr = { k, 0 };
        solve( root, arr );
        
        
        return arr[1];
    }
    
    
    
    
    static
    void
    solve
    (
        TreeNode root
        , int[] arr
    )
    {
        
        if
        (
            root == null
        )
        {
            return;
        }
        
        solve( root.left, arr );
        
        if
        (
            arr[0] == 0
        )
        {
            return;
        }
        
        arr[0] --;
        
        if
        (
            arr[0] == 0
        )
        {
            arr[1] = root.data;
            
            return;
        }
        
        solve( root.right, arr );
    }
    
}
