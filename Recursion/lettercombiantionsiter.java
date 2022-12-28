import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println(letterCombinations("923"));
	}
    public static List<String> letterCombinations(String digits) {
        ArrayList<String> lis = new ArrayList<String>();
  HashMap<Character,String> map = new HashMap<Character,String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
    	lis.add("");
    	for(int i = 0;i<digits.length();i++){
       ArrayList<String> in = new ArrayList<String>();
    		char ch = digits.charAt(i);
    		String comb = map.get(ch);
    	//	System.out.println(comb);
    		for(String x : lis){
    			for(char y : comb.toCharArray()){
    				in.add(x+y+"");
    			}
    		}
    		lis = in;
    	}
    return lis;
    }
}
