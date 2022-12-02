import java.util.Scanner;
public class Potencia {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i=1, p, b, e;
		System.out.println("Digite o valor da base:");
		b = in.nextInt();
		System.out.println("Digite o valor do expoente:");
		e = in.nextInt();
		p = b;
		if (e==0) {
			p = 1;
		} else {	
			while (i<e) {
				p = p*b;
				i++;
			}

		}
		System.out.println("A potência é: "+p);
		in.close();
	}
}
