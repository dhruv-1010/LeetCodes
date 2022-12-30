import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<String> nee = new ArrayList<String>();
		rec(nee,"",1,0,0);
	//	return nee;
	System.out.println(nee);
	}
	static void rec(List nee,String p,int n ,int a,int b){
	if(a==n && b==n){
		nee.add(p);
		return;
			}	
		if(a<n ){
		    rec(nee,p+'(',n,a+1,b);
		}
		if(b<n && b<a){
			rec(nee,p+')',n,a,b+1);
		}
	}
}