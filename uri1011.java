package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double raio = sc.nextDouble();
			double pi = 3.14159;
			
			double volumeEsfera = (4/3.0) * pi * Math.pow(raio, 3);
			
			System.out.printf("VOLUME = %.3f%n", volumeEsfera);
			
			sc.close();
			
		}
}
