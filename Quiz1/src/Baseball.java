import java.util.Scanner;

public class Baseball {
	public static String Name;
	private static double BA;
	private static double OBP;
	private static double SLG;
	private static double OPS;
	public static double TB;
	public static double AB;
	public static double H;
	public static double doubles;
	public static double triples;
	public static double HR;
	public static double R;
	public static double Walks;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the player's name");
		Name = reader.nextLine();
		System.out.println("Enter their At Bats");
		AB = reader.nextDouble();
		System.out.println("Enter their hits");
		H = reader.nextDouble();
		System.out.println("Enter their doubles");
		doubles = reader.nextDouble();
		System.out.println("Enter their triples");
		triples = reader.nextDouble();
		System.out.println("Enter their Home Runs");
		HR = reader.nextDouble();
		System.out.println("Enter their Runs");
		R = reader.nextDouble();
		System.out.println("Enter their Walks");
		Walks = reader.nextDouble();
		BA = findBA(H, AB);
		OBP = findOBP(AB, H, Walks);
		SLG = findSLG(AB, H, doubles, triples, HR);
		OPS = findOPS(OBP, SLG);
		TB = findTB(H, doubles, triples, HR);
		System.out.println("Player: " + Name);
		System.out.println("BA: " + BA);
		System.out.println("OBP: " + OBP);
		System.out.println("SLG: " + SLG);
		System.out.println("OPS: " + OPS);
		System.out.println("TB: " + TB);
		System.out.println("At Bats: " + AB);
		System.out.println("Hits: " + H);
		System.out.println("Doubles: " + doubles);
		System.out.println("Triples: " + triples);
		System.out.println("Home Runs: " + HR);
		System.out.println("Runs: " + R);
		System.out.println("Walks: " + Walks);
	}

	public static double findBA(double H, double AB) {
		return H/AB;
	}

	public static double findOBP(double AB, double H, double Walks) {
		return (H + Walks) / (AB + Walks);
	}

	public static double findSLG(double AB, double H, double doubles, double triples, double HR) {
		return findTB(H, doubles, triples, HR) / AB;
	}

	public static double findOPS(double obp, double slg) {
		return obp + slg;
	}

	public static double findTB(double H, double doubles, double triples, double HR) {
		return (2 * doubles) + (3 * triples) + (H - (doubles + triples)) + (4 * HR);
	}
}
