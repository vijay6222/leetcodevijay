class Solution {
    public int removeDuplicates(int[] n) {
        if(n.length==0) return 0;
        int u=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]!=n[u])
            {
                u++;
                n[u]=n[i];
            }


        }
        return u+1;
        
    }
}