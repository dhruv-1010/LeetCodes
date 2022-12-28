import java.util.*;
public class Main {
	public static void main(String[] args) {
	ArrayList<List<Integer>> nee = new ArrayList<List<Integer>>();
		//int n = 20,k=4;
		rec(nee,new ArrayList<Integer>(),n,k,1);
		System.out.println(nee);
	}
	static void rec(ArrayList<List<Integer>> nee,ArrayList<Integer> in,int n,int k,int s){
		if(k==0){
			nee.add(new ArrayList<Integer>(in));
			return;
		}
		for(int i = s;i<=n;i++){
			in.add(i);
			rec(nee,in,n,k-1,i+1);
			in.remove(in.size()-1);
		}
	}
}