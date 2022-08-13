package For;

public class star4 {

	public static void main(String[] args) {
		for (int line=1; line<=5; line++) {
			for (int emt=4; emt>=line; emt--) {
				System.out.print(" ");
			}
			for (int star=1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
