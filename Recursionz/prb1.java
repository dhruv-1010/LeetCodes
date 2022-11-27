public class Main {
	static void n(String ab,int z){
		if(z==0) return;
		System.out.println(ab);
		z--;
		n(ab,z);
		}
	public static void main(String[] args) {
		String name = "MVP";
		int z = 11;
		n(name,z);
	}
}