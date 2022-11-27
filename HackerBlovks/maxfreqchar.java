import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		int len = s.length();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>() ;
		for(int i = 0;i<len;i++){
			if(map.containsKey(s.charAt(i))){
				int count = map.get(s.charAt(i));
				count++;
				map.put(s.charAt(i),count);
			}else{
				map.put(s.charAt(i),1);
			}
		}
		int maxval = map.get(s.charAt(0));
		char ans = s.charAt(0);
		for(int i = 0;i<len;i++){
			if(map.get(s.charAt(i))>maxval){
				maxval = map.get(s.charAt(i));
				ans = s.charAt(i);
			}
		}
//		System.out.println(maxval);
		System.out.println(ans);
		
	}
}