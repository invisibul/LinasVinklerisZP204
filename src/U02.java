import java.util.Scanner;

public class U02 {

	public static void main(String[] args) {
		int d, k, n;
		Scanner rd = new Scanner(System.in);
		System.out.print("iveskite deziu skaiciu: ");
		d = rd.nextInt();
		System.out.print("iveskite knygu skaiciu: ");
		k = rd.nextInt();
		System.out.print("iveskite kelios knygos telpa i deze: ");
		n = rd.nextInt();
		
		if (n * d >= k)
			System.out.println("knygos telpa i dezes.");
		else {
			System.out.println("knygos netelpa i dezes");
			System.out.println("i dezes netilpo " + (k - (n * d)) + " knygos/-a/-u" );
		}
			
	}

}
