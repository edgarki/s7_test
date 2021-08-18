public class Q3
{
    
    private String concat(String[] s){
        StringBuffer ss = new StringBuffer();
        for(int i = 0; i < s.length; i++) {
            ss.append(s[i]);
        }
        return ss.toString();
    }
    
    private boolean containSub(String s, String t){
        return s.indexOf(t) !=-1? true: false;
    }

    public String concatRemove(String[] s, String[] t, int k)
    {
        String S = this.concat(s);
        String T = this.concat(t);
        for (int i = 0; i < T.length(); i++){
            if (!this.containSub(S,T.substring(0,i))){
                return S.length()-i-1 <= k? "yes" : "no";
            }
        }
        return "no";
    }
    
    public void use(){
        System.out.println(this.concatRemove(new String[] {"bla", "bla", "bla", "bla"}, new String[] {"blablabcde"}, 3));
    }
}
