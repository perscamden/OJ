import java.util.*;

/************************************************************
 * 
 * Following is the TreeNode class structure class TreeNode<T> { public: T data;
 * TreeNode<T> left; TreeNode<T> right;
 * 
 * TreeNode(T data) { this.data = data; left = null; right = null; } };
 ************************************************************/

public class Solution
{

    public static
    Boolean
    isDeadEnd
    (
        TreeNode < Integer > root
    )
    {
        HashSet < Integer > hashSet = new HashSet <> ();
        hashSet.add( 0 );


        return solve( root, hashSet );
    }




    static
    boolean
    solve
    (
        TreeNode < Integer > root
        , HashSet < Integer > hashSet
    )
    {

        if
        (
            root == null
        )
        {
            return false;
        }

        hashSet.add( root.data );
        
        if
        (
            root.left == null
            && root.right == null
        )
        {
            return hashSet.contains( root.data - 1 )
                && hashSet.contains( root.data + 1 );
        }
        else
        {
            return solve( root.left, hashSet )
                || solve( root.right, hashSet );
        }

    }

}
