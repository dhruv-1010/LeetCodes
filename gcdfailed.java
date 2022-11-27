import java.util.Scanner;
public class Main {
	static int gcd(int a, int b) {
		while (b != a) {
			if (b > a) b = b - a;
			else a = a - b;
		}
		return b;
	}
	static int gcdr(int a, int b) {
		if (b == 0) return a;
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(gcd(a, b));
			System.out.println(gcdr(a, b));
		}
	}
}