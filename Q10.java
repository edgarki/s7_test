public class Q10
{
    public String rev(String s){
        int start = 0;
        int end = s.length() - 1;
        char[] str = s.toCharArray();
        while (start < end){
            str[start] ^= str[end];
            str[end] ^= str[start];
            str[start] ^= str[end];
     
            ++start;
            --end;
        }
        return String.valueOf(str);
    }
}
