package uri;

import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int distanciaFornecida = sc.nextInt();
		int qtdMinutos = (60 * distanciaFornecida) / 30;
		
		System.out.println(qtdMinutos + " minutos");
		
		
		
		sc.close();
	}

}
