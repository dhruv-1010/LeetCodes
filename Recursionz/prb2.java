public class Main {
	static int i=1;
	static void n(int ab){
		if(ab==0) return;
		System.out.println(i);
		ab--;
		i++;
		n(ab);
		}
	public static void main(String[] args) {
		int z = 11;
		n(z);
	}
}