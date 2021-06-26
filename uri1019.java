package uri;

import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalSegundos = sc.nextInt();
		
		int qtdHoras = totalSegundos / 3600;
		totalSegundos = totalSegundos % 3600;
		
		int qtdMinutos = totalSegundos / 60;
		totalSegundos = totalSegundos % 60;
		
		int qtdSegundos = totalSegundos;
		
		System.out.println(qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos);
		
		
				
		sc.close();
		

	}

}
