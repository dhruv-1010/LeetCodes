public class Main {
	static void n(int i,int ab){
		if(i>ab) return;
		n(i+1,ab);
		System.out.println(i);
		}
	public static void main(String[] args) {
		int z = 11;
		n(1,z);
	}
}