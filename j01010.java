//Với một vài số nguyên dương có 1 chữ số, khi cắt đôi số đó theo chiều ngang và lấy nửa phía trên thì ta vẫn có một số nguyên. Cụ thể:

//Số 0 cắt đôi vẫn ra số 0
//Số 1 cắt đôi vẫn ra số 1
//Số 8 cắt đôi ra số 0
//Số 9 cắt đôi ra số 0
//Các số khác cắt đôi sẽ không hợp lệ.
//Cho một số nguyên dương không quá 18 chữ số. Hãy in ra kết quả “cắt đôi” của số đó.

//Nếu không hợp lệ thì ghi ra INVALID. Chú ý: nếu cắt đôi ra một dãy toàn 0 thì cũng được coi là không hợp lệ. Kết quả cắt đôi thì không tính chữ số 0 ở đầu.

package lamlai;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			boolean check = true;
			String s = sc.next();
			StringBuilder result = new StringBuilder();
			int l = s.length();
			for (int i = 0; i < l; i++) {
				if (s.charAt(i) == '1')
					result.append('1');
				else if (s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') {
					result.append('0');
				} else {
					check = false;
					break;
				}
			}
			while (result.length() > 0 && result.charAt(0) == '0') {
				result.deleteCharAt(0);
			}
			if (check && result.length() > 0)
				System.out.println(result.toString());
			else
				System.out.println("INVALID");
		}
	}
}
