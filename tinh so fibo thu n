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
	public static long fibo(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		long f1 = 1, f2 = 1, fn = 0;
		for (int i = 3; i <= n; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(fibo(n));
		}
	}
}
