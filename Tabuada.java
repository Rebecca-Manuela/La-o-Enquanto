import java.util.Scanner;
public class Tabuada {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int i=1,n,resul;
		System.out.println("Digite um número:");	
		n=in.nextInt();
		while(i<=10) {		
			resul=n*i;
			System.out.println(n+"x"+i+"="+resul);
			i++;	
		}		
		in.close();
	}
}
