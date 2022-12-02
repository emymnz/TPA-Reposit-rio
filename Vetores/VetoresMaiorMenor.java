import java.util.*;
public class VetoresMaiorMenor {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		final  int TAM=10;
		int i, a[], maiorV=0, menorV=0;
		a=new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "º valor:");
			a[i]=in.nextInt();
		}
		for (i=0; i<TAM; i++) {
			if (a[i]>maiorV) {
				maiorV=a[i];
			}else if (a[i]<0 || i==0) {
				menorV=a[i];
			}
		}
		System.out.println("MAIOR VALOR: " + maiorV);
		System.out.println("MENOR VALOR: " + menorV);
		in.close();
	}
}
