
public class TestAlgoritmaiLinas {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,2,3,4,5,6};
		int[] c = {1,4,5,4,8,7};
		AlgoritmaiLinas al = new AlgoritmaiLinas();
	al.print(a);
	al.print(b);
	al.print(c);
	System.out.println(al.equals(a, b));
	System.out.println(al.equals(a, c));
	}

}
