package medidasTerreno;

import java.util.Locale;
import java.util.Scanner;

public class medidasTerreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Qual a largura? ");
		Double largura = sc.nextDouble();
		
		System.out.println("Qual o comprimento? ");
		Double comprimento = sc.nextDouble();
		
		System.out.println("Quantos Metros Quadrados? ");
		Double metroQuadrado = sc.nextDouble();
		
		Double area = largura * comprimento;
		
		Double preco = area * metroQuadrado;
		
		System.out.printf("O valor total é de: %.2f%n", preco);
		
		sc.close();
		

	}

}
