/*Cho số nguyên dương n. Hãy kiểm tra xem n có phải là số trong dãy Fibonacci hay không?

Input:

Dòng đầu tiên đưa vào số lượng bộ test T.
Những dòng kế tiếp đưa vào các bộ test. Mỗi bộ test là một số nguyên dương n.
T, n thỏa mãn ràng buộc :1 ≤ T ≤ 100; 0≤n≤1018.
Output:

Đưa ra “YES” hoặc “NO” tương ứng với n là số Fibonacci hoặc không phải số Fibonacci của mỗi test theo từng dòng.*/

package lamlai;

import java.util.Scanner;

public class test {

//	public static Map<Integer, Integer> phanTich(int n) {
//		Map<Integer, Integer> soSoNT = new LinkedHashMap<>();
//		for (int i = 2; i < Math.sqrt(n); i++) {
//			int dem = 0;
//			while (n % i == 0) {
//				n /= i;
//				dem++;
//			}
//			if (dem > 0)
//				soSoNT.put(i, dem);
//		}
//		if (n > 1)
//			soSoNT.put(n, 1);
//		return soSoNT;
//	}

	public static boolean checkFibo(long n) {
		if (n == 1)
			return true;
		long f1 = 1, f2 = 1, fn = 0;
		while (fn < n) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		return fn == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			long n = sc.nextLong();
			if (checkFibo(n))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
