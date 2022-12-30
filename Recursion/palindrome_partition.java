import java.util.*;
public class Main {
	public static void main(String[] args) {
		String up = "aab";
		ArrayList<List<String>> nee = new ArrayList<List<String>>();
		rec(nee,up,new ArrayList<String>());
		return nee;
	}
	private static void rec(ArrayList<List<String>> nee,String str,ArrayList<String> in){
		if(str.length()==0){
			nee.add(new ArrayList<String>(in));
		}
		for(int i = 1;i<=str.length();i++){
			String s = str.substring(0,i);
			if(isP(s)){
				in.add(s);
				rec(nee,str.substring(i),in);
				in.remove(in.size()-1);
			}
		}
		
	}
	private static boolean isP(String s){
		int i = 0;
		int j = s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}