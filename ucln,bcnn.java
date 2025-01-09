import java.util.Scanner;

public class test {
	public static long uCLN(long a, long b) {
		while (b != 0) {
			long remain = a % b;
			a = b;
			b = remain;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		while (t-- > 0) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			System.out.println(a * b / uCLN(a, b) + " " + uCLN(a, b));
		}
	}
}
