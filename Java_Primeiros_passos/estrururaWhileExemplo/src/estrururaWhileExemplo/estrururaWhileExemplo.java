package estrururaWhileExemplo;

import java.util.Scanner;

public class estrururaWhileExemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.printf("A soma total é: %d%n", soma);
		sc.close();

	}

}
