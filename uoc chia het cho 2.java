package lamlai;

import java.util.Scanner;

public class test {
	public static int uocChiaHai(int n) {
		int count = 0;
		for (int i = 1; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i % 2 == 0) {
					count++;
				}
				if (i != (n / i) && (n / i) % 2 == 0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(uocChiaHai(n));
		}
	}
}
