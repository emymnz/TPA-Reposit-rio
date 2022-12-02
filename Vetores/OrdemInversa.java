import java.util.*;
public class OrdemInversa {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int i, j=9;
		final int TAM = 10;
		int a[] = new int[TAM];
		int b[] = new int[TAM];

		for(i=0; i<TAM; i++){
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
		}
		System.out.print("a=[ ");
		for (i=0; i<TAM; i++) {
			if (i<9) {
				System.out.print(a[i] + ", ");
			}else {
				System.out.print(a[i] + " ]");
			}
		}
		System.out.println(" ");
		System.out.print("b=[ ");
		for (i=0; i<TAM; i++) {
			if (i<9) {
				System.out.print(b[i] + ", ");
			}else {
				System.out.print(b[i]+ " ]");
			}
		}
		in.close();
	}
}
