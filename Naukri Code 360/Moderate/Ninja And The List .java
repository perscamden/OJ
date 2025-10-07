import java.util.*;

/*
These are pre-implemented class methods. You just need to implement the below empty class.
class NestedInteger {
    
    // Return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger() {
         return a.size() == 0;
    }
    // Return the single integer that this NestedInteger holds if it holds a single integer.
    // The result is '-1' if this NestedInteger holds a nested list.
    public int getInteger() {
         return data;
     }
    // Return the nested list that this NestedInteger holds if it holds a nested list.
    // The result is '[]' if this NestedInteger holds a single integer.
    public ArrayList<NestedInteger> getList() {
    }
 };

*/

public class NestedIterator
{
    ArrayList< Integer > arrayList;
    int idx;




    NestedIterator
    (
        List < NestedInteger > nestedList
    )
    {
        idx = 0;
        arrayList = new ArrayList <> ();
        add( nestedList );
    }
    



    void
    add
    (
        List < NestedInteger > nestedList
    )
    {

        
        for
        (
            NestedInteger nestedInteger
            : nestedList
        )
        {

            if
            (
                nestedInteger.isInteger()
            )
            {
                arrayList.add( nestedInteger.getInteger() );
            }
            else
            {
                add( nestedInteger.getList() );
            }

        }


    }




    public
    int
    next
    ()
    {
        return arrayList.get( idx ++ );
    }




    public
    boolean
    hasNext
    ()
    {
        return idx < arrayList.size();
    }
    
 }
