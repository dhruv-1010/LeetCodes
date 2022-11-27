public class Main {
	public static void main(String[] args) {
		String t = "ABCDEFGH";
		
		int[] fret = new int[256];
		int[] fres = new int[256];
		for(int i = 0;i<t.length();i++){
			fret[(int)t.charAt(i)]++;
			}
	    int si = 0,ei = 0,start=-1,len,count=0;
	    while(ei<s.length()){
	    	// increasing window
	    	char ch = s.charAt(ei);
	    	fres[ch]++;
	    	if(fret[ch] >= fres[ch]){
	    		count++;
	    		}
	    	// base conditions
	    	if(count == t.length()){
	    		while(fres[s.charAt(si)] >= fres[s.charAt(si)]{
	    			fres[s.charAt(si)]--;
	    			si++;
	    			}
	    		if(len>ei-si+1){
	    			len=ei-si+1;
	    			start = si;}
	    		}
	    	}
	    
	    if(start = -1){
	    	return "";
	    }
	    return s.subtring(start,start+len);
	}
}