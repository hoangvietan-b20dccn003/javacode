/*
 Một đơn đồ thị vô hướng được gọi là Hình Sao nếu có một đỉnh có thể nối đến tất cả các đỉnh còn lại, còn các đỉnh khác thì không có cạnh nối với nhau.

Cho mô tả một đơn đồ thị vô hướng N đỉnh với đúng N-1 cạnh. Hãy kiểm tra xem đồ thị đó có phải dạng Hình Sao hay không.

Dữ liệu vào

Dòng đầu tiên ghi số N là số đỉnh của đồ thị (1 ≤ N ≤ 105).
N-1 dòng tiếp theo, mỗi dòng ghi ra một cặp (u,v) là cạnh của đồ thị. Dữ liệu đảm bảo u ≠ v.
Kết quả

Ghi ra trên một dòng chữ “Yes” nếu đồ thị là Hình Sao; chữ “No” trong trường hợp ngược lại.
 */
package lamlai;

import java.util.HashMap;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n - 1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			map.put(u, map.getOrDefault(u, 0) + 1);
			map.put(v, map.getOrDefault(v, 0) + 1);
		}
		int dinhTT = 0;
		int dinhLa = 0;
		for (int x : map.values()) {
			if (x == n - 1)
				dinhTT++;
			else if (x == 1)
				dinhLa++;
			else {
				System.out.println("No");
				return;
			}
		}
		if (dinhTT == 1 && dinhLa == n - 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
