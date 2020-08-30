package corejava;

public class Pattern1 {

	public static void main(String[] ks) {

		int n = 5;
		Pattern1 p = new Pattern1();
		String s = p.get(5);
		System.out.println(s);
	}

	private String get(int num) {
		if (num < 0) {
			return "-1";
		} else if (num == 0) {
			return "-2";
		} else {

			String s = "";

			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					// System.out.print(i*j+" ");
					int b = i * j;
					s = s.concat(String.valueOf(b) + " ");
					// s=s.concat(" ");
				}
				s = s.concat("\n");
				// System.out.println();
			}

			return s;
		}
	}
}
