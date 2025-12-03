class Solution {
    public String longestCommonPrefix(String[] st) {
       if(st== null || st.length==0) return "";
       String p=st[0];
       int pre=p.length();
       for(int i=1;i<st.length;i++){
        String s=st[i];
        while(pre>s.length()|| !p.equals(s.substring(0,pre))){
            pre--;
            if(pre==0)
            {
                return"";

            }
            p=p.substring(0,pre);
        }
       }
       return p;
   
    }
}