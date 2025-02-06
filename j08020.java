/*
Cho một xâu chỉ gồm các kí tự ‘(‘, ‘)’, ‘[‘, ‘]’, ‘{‘, ‘}’. Một dãy ngoặc đúng được định nghĩa như sau:

-     Xâu rỗng là 1 dãy ngoặc đúng.

-     Nếu A là 1 dãy ngoặc đúng thì (A), [A], {A} là 1 dãy ngoặc đúng.

-     Nếu A và B là 2 dãy ngoặc đúng thì AB là 1 dãy ngoặc đúng.

Cho một xâu S. Nhiệm vụ của bạn là xác định xâu S có là dãy ngoặc đúng hay không?
 */
package lamlai;

import java.util.Scanner;
import java.util.Stack;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			Stack<Character> st = new Stack<>();
			String s = sc.nextLine();
			for (int i = 0; i < s.length(); i++) {
				if (st.empty())
					st.push(s.charAt(i));
				else {
					if (st.lastElement() == '[' && s.charAt(i) == ']')
						st.pop();
					else if (st.lastElement() == '(' && s.charAt(i) == ')')
						st.pop();
					else if (st.lastElement() == '{' && s.charAt(i) == '}')
						st.pop();
					else
						st.push(s.charAt(i));
				}
			}
			if (st.empty())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
