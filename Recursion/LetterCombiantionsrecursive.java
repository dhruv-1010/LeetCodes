import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println(letterCombinations("78"));
	}
    public static ArrayList<String> letterCombinations(String digits) {
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
        rec(lis,map,new ArrayList<>(),0,digits);
        return lis;
    }
static void rec(ArrayList<String> lis,HashMap  <Character,String>map,ArrayList<Character> in,int si,String digits){
	if(si==digits.length()){
	    String ans ="";
	    for(char x : in) ans+=x+"";
	    lis.add(ans);
	    return;
		}
	char ch = digits.charAt(si);
	String lim = map.get(ch);
	for(int i = 0;i<lim.length();i++){
		in.add(lim.charAt(i));
		rec(lis,map,in,si+1,digits);
		in.remove(in.size()-1);
	}
}
}