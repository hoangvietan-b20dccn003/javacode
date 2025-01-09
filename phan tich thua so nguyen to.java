/*Hãy phân tích một số nguyên dương thành tích các thừa số nguyên tố.   

Dữ liệu vào: Dòng đầu tiên ghi số bộ test. Mỗi bộ test viết trên một dòng số nguyên dương n không quá 9 chữ số. 

Kết quả: Mỗi bộ test viết ra thứ tự bộ test, sau đó lần lượt là các số nguyên tố khác nhau có trong tích, với mỗi số viết thêm số lượng số đó. Xem ví dụ để hiểu rõ hơn về cách viết kết quả.*/

package lamlai;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static Map<Integer, Integer> phanTich(int n) {
		Map<Integer, Integer> soSoNT = new LinkedHashMap<>();
		for (int i = 2; i < Math.sqrt(n); i++) {
			int dem = 0;
			while (n % i == 0) {
				n /= i;
				dem++;
			}
			if (dem > 0)
				soSoNT.put(i, dem);
		}
		if (n > 1)
			soSoNT.put(n, 1);
		return soSoNT;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int i = 1;
		while (t-- > 0) {
			int n = sc.nextInt();
			Map<Integer, Integer> ketQua = phanTich(n);

			System.out.print("Test " + i + ": ");
			for (Map.Entry<Integer, Integer> entry : ketQua.entrySet()) {
				System.out.print(entry.getKey() + "(" + entry.getValue() + ") ");
			}
			i++;
			System.out.println();
		}
	}
}
