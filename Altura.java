
public class Altura {
	public static void main(String[]args) {
		int ano=1;
		double j = 134, p = 145;
		while(j<=p) {
			j = j+2.5;
			p = p+2;
			ano++;
			System.out.println(ano+", João: "+j+"cm, Pedro: "+p+"cm.");
		}
		System.out.println(ano+"anos, para João ficar maior que Pedro.");
	}
}
