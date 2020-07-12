import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class pro {
public static double avg(List<Integer> list){
IntSummaryStatistics summaryStats = list.stream()
      .mapToInt((a) -> a)
      .summaryStatistics();
      return summaryStats.getAverage();

}


public static List<String> search(List<String> list) {
return list.stream()
  .filter(s -> s.startsWith("a"))
  .filter(s -> s.length() == 3)
  .collect(Collectors.toList());
  
}


public static List<String> palin(List<String> list) {
List<String> f = new ArrayList<>();
for(String str : list){
	if(isPalindrome(str))
	{
		f.add(str);
	}
}
  return f;
}

public static boolean isPalindrome(String input) {
    String temp = input.replaceAll("\\s+", "").toLowerCase();
    return IntStream.range(0, input.length() / 2)
        .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
}
  
   public static void main(String []args){
      List<Integer> list = Arrays.asList(10, 20, 50, 100, 130, 150, 200, 250, 500);
	  List<String> l = Arrays.asList("gh","ahg","aa","","ashg");
	  List<String> li = Arrays.asList("ghncvb","ahgha","aa","","ashghsa");
	  System.out.println("Average of a List = "+avg(list));
	  System.out.println("list of strings starting with a and length 3 = "+search(l));
	   System.out.println("list of palindromes = "+palin(li));
   }
}