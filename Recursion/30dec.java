import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[][] graph = {{1,2,3},{3},{3},{}};
		ArrayList<List<Integer>> nee = new ArrayList<List<Integer>>();
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(0);
		rec(graph,nee,in,0,graph.length-1);
		System.out.println(nee);
	}
	static void rec(int[][] graph,List nee,List in,int start,int end){
		if(start == end){
			nee.add(new ArrayList<Integer>(in));
			return;
		}
		for(int child : graph[start]){
				in.add(child);
				rec(graph,nee,in,child,end);
				in.remove(in.size()-1);
			}
		}
}