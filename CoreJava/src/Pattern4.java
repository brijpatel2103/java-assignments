public class Pattern4 {
	public static void main(String[] args) {
		int i, j, k;
		int n = 10;
		for (i = 0; i < n; i++) {
			for (k = 0; k <= n - i; k++) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (i = n; i >=0; i--) {
			for (k = 0; k <= n - i; k++) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
