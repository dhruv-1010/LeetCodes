import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String main = sc.next();
		String dub = sc.next();
		System.out.println(main);
		int[] mfre = new int[256];
		int[] dfre = new int[256];
		for(int i = 0;i<dub.length();i++){
			dfre[dub.charAt(i)]++;
			}
		int ei = 0,si=0,mlen=Integer.MAX_VALUE,start=-1,cnt =0;
		while(ei<main.length()){
			mfre[main.charAt(ei)]++;
			if(dfre[main.charAt(ei)]>=mfre[main.charAt(ei)] && si<=ei){cnt++;}
			// resize
			if(cnt == dub.length()){
				while(mfre[main.charAt(si)] > dfre[main.charAt(si)] &&si<=ei){
					mfre[main.charAt(si)]--;
					si++;}
				if(mlen>ei-si+1){
					mlen=ei-si+1;
					start=si;}
				}
			ei++;
		}
		String ans = "";
		if(start != -1) ans = main.substring(start,mlen+start);
		System.out.println(ans);
	}
}