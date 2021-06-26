package uri;


import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		
		System.out.printf("%.3f km/l\n", a / b);
		
		sc.close();
		
		
				
		
		
		
		
	}

}
