public class Main {
	public static void main(String[] args) {
		int n = 5;
		int r = 0;
		int sp = n;
		while(r<=n){
			int j = 0;
			while(j<=sp){
				System.out.print(" ");
				j++;
				}
			int i = 0;
			int in = 1;
			while(i<=r){
				System.out.print(in+" ");
				in = (in*(r-i))/(i+1);
				i++;
			}
			sp--;
			System.out.println("");
			r++;
			
		}
	}
}