import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(rec(s,0));
	}
	static String se = "";
	static String rec(String s,int i){
		if(i==s.length()) return se;
		if(s.charAt(i)=='a') return rec(s,i+1);
		else{
			se+=s.charAt(i)+"";
			return rec(s,i+1);
			}
		
		}
}