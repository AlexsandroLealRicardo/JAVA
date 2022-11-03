package App;

import java.util.Locale;
import java.util.Scanner;

public class problema_soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		
		for (int i = 0; i < N; i++) {
			System.out.printf(" %.1f ", vet[i]);
		}
		
		double soma = 0.0;
		double media = soma / N;
		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		
		System.out.printf("%nSOMA = %.2f %n", soma);
		System.out.printf("MEDIA = %.2f %n", media);
		
		sc.close();
	}

}
