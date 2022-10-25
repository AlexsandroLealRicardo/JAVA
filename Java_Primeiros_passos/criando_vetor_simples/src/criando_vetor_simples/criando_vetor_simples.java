package criando_vetor_simples;

import java.util.Locale;
import java.util.Scanner;

public class criando_vetor_simples {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos espaços terá o seu vetor?");
		int N = sc.nextInt();
		
		// cria um vetor que armazena o valor inserido na variavel 'N'
		int[] vet = new int[N];
		
		// realiza o looping que armazena os valores inseridos no vetor
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero:");	
			vet[i] = sc.nextInt();
		}
		System.out.println("Os valores negativos são:");
		// realiza o filtro que mostra na tela somente os vaores negativos
		for (int i = 0; i < N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		sc.close();
	}
}
