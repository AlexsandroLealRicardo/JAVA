package tabuada_estrutura_for;

import java.util.Scanner;

public class tabuada_estrutura_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		System.out.println();
		int N = sc.nextInt();
		System.out.println();
		System.out.printf("A tabuada do %d é:%n", N);
		System.out.println();
		
		for(int i=0; i <= 10; i++) {
			int produto = i * N;
			System.out.println(i + " X " + N + " = " + produto);
		}
		
		sc.close();

	}

}
