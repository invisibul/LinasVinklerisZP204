import java.util.Scanner;

public class U05 {

	public static void main(String[] args) {
		int p1, p2, p3;
		Scanner rd = new Scanner(System.in);
		p1 = rd.nextInt();
		p2 = rd.nextInt();
		p3 = rd.nextInt();
		System.out.println(gautiGeriausiaIvertinima(p1,p2,p3));
	}
	public static int gautiGeriausiaIvertinima(int p1, int p2, int p3) {
		int best = 0;
		if (p1 > best) best = p1;
		if (p2 > best) best = p2;
		if (p3 > best) best = p3;
		return best;
	}
}
