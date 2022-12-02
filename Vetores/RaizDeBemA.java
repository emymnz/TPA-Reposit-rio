import java.util.*;
public class RaizDeBemA {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		final  int TAM=10;
		int i;
		double a[], b[];
		a=new double [TAM];
		b=new double [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "º valor");
			a[i]=in.nextInt();
			b[i]=Math.sqrt(a[i]);
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
