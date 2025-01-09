/*Nhập một dãy số nguyên có n phần tử (n không quá 100, các phần tử trong dãy không quá 109). Hãy viết chương trình kiểm tra xem dãy có phải đối xứng hay không. Nếu đúng in ra YES, nếu sai in ra NO.

Dữ liệu vào: Dòng đầu ghi số bộ test, mỗi bộ test gồm hai dòng. Dòng đầu là số phần tử của dãy, dòng sau ghi ra dãy đó, mỗi số cách nhau một khoảng trống.

Kết quả: In ra kết quả kiểm tra.*/

package lamlai;

import java.util.Scanner;

public class test {

//	public static boolean check(String s) {
//		int sum = 0;
//		for (int i = 0; i < s.length(); i++) {
//			sum += s.charAt(i) - '0';
//		}
//		for (int i = 0; i < s.length() - 1; i++) {
//			int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
//			if (diff != 2) {
//				return false;
//			}
//		}
//		return sum % 10 == 0;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			boolean check = true;
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n / 2; i++) {
				if (a[i] != a[n - 1 - i]) {
					check = false;
					break;
				}
			}
			if (check)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
