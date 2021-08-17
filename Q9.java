import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Q9{
  public long counter(String a){
      return a.chars().filter(ch -> ch != ' ').count(); 
  }
}
