
public class AlgoritmaiLinas {
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");		
		}
		System.out.println();
	}
	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i ++) {
				if (array1[i] != array2[i])return false;
			}
				
		}
		else return false;
		return true;
	}
	
}
