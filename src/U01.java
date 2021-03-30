import java.util.Scanner;

public class U01 {

	public static void main(String[] args) {
		String[] dienos = {"pirmadieni","antradieni","treciadieni","ketvirtadieni","penktadieni"};
		
		Scanner rd = new Scanner(System.in);
		int suma = 0;
			for (int i = 0; i < 5; i++) {
				 System.out.print("Kiek pamoku yra " + dienos[i] + "? ");
				suma += rd.nextInt();
			}
		int min = suma * 45;
		System.out.println("pamoku skaicius: " + suma);
		System.out.println("tai sudaro minuciu: " + min);
		
	}

}
