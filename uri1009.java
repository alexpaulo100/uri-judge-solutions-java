package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String vendedor = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendasEfetuadas = sc.nextDouble();
		double comissao = vendasEfetuadas * 0.15;
		
		double total = salarioFixo + comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		
		
		
		sc.close();
		
	}
}
