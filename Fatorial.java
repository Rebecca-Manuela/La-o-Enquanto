import java.util.*;
public class Fatorial {
	public static void main(String[]args) {
		int n, f;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o número: ");
		n = in.nextInt();
		f = n;
		while(n>1) {
			System.out.print(n+"x");
			n = n-1;
			f =  f*(n);
		}
		System.out.println(n+"= "+f);
		in.close();
	}
}
