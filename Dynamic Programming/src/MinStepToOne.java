
public class MinStepToOne {

	private static int countSteps(int n) {
		if (n == 1) {
			return 0;
		}
		int op1 = countSteps(n - 1);
		int ans = op1;
		if (n % 3 == 0) {
			int op2 = countSteps(n / 3);

			if (ans > op2) {
				ans = op2;
			}
		}
		if (n % 2 == 0) {
			int op3 = countSteps(n / 2);
			if (op3 < ans) {
				ans = op3;
			}

		}
		return 1 + ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
System.out.println(countSteps(n));
	}

}
