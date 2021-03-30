import java.util.Scanner;

public class U06 {

	public static void main(String[] args) {
		
		int n, Aval, Amin, Bval, Bmin, trukme = 0;
		Scanner rd = new Scanner(System.in);
		n = rd.nextInt();
		for (int i = 0; i < n; i++) {
			Aval = rd.nextInt();
			Amin = rd.nextInt();
			Bval = rd.nextInt();
			Bmin = rd.nextInt();						
		trukme += gautiTrukmeMinutemis(Aval,Amin,Bval,Bmin);
		}
		System.out.println(gautiLaikoFormata((trukme / 60),( trukme % 60)));
	}
public static int gautiTrukmeMinutemis(int Aval, int Amin,int Bval,int Bmin) {
	Amin += Aval * 60;
	Bmin += Bval * 60;
	return Bmin - Amin;
}
public static String gautiLaikoFormata(int val, int min) {
	String suformatuota = val + " val. " + min + " min. ";
	return suformatuota;
}
}
