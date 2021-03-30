import java.util.Scanner;

public class U04 {

	public static void main(String[] args) {
		int a, b, marskineliai = 0;
		Scanner rd = new Scanner(System.in);
		System.out.print("ivekite intervalo pradzia: ");
		a = rd.nextInt();
		System.out.print("ivekite intervalo pabaiga: ");
		b = rd.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 6 == 0) marskineliai++;
		}
		System.out.println("reikalingu marskineliu skaicius: "+ marskineliai);
	}

}
