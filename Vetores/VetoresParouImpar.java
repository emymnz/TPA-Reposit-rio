import java.util.*;
public class VetoresParouImpar {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		final  int TAM=10;
		int i, j=0, a[];
		a=new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "� valor:");
			a[i]=in.nextInt();
		}
		System.out.print("a=[");
		for (i=0; i<TAM; i++) {
			if (a[i]%2==0 && i!=9) {
				System.out.print(a[i] + ",");
				j++;
			}else if (i<9){
				System.out.print(" ");
			}else if (i==9) {
				System.out.println(a[i] + " ]");
				j++;
			}
		}
		System.out.print("Dentre os n�meros digitados: " + j + " s�o PARES");
		in.close();
	}
}
