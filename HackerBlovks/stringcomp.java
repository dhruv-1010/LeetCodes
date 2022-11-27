import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder nee= new StringBuilder();
		String qs = sc.nextLine();
		int index =0,i=0;
	    while(index<qs.length()){
	    	int count = 0;
	    	while(i<qs.length()&&(qs.charAt(i)==qs.charAt(index))){
	    		count++;
	    		i++;
	    	}
	    	nee.append(qs.charAt(index));
	    	nee.append(count+"");
	    	index=i;
	    }
	    return nee.length();
	}
}