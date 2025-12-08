import calcapp.logics.Calclogic;

public class Main6_4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = Calclogic.tasu(a, b);
		int delta = Calclogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);

	}

}
