class Solution 
{
    public boolean increasingTriplet(int[] nums)
    {
        int first=Integer.MAX_VALUE;  //for the first starting smaller val
        int second=Integer.MAX_VALUE; //then the next Bigger val
        for(int i : nums)
        {
            if(first>=i)   first=i;
            else if(second>=i)  second=i;
            else
                return true; // if we found the val that are both greater than the  
                             // first and second we can say we found required sequence
        }
        return false;
    }
}