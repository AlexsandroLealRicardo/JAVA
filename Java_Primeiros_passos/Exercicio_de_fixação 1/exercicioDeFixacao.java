package exercicioDeFixacao;

import java.util.Locale; //Importação do modulo que muda o local para EUA.

public class exercicioDeFixacao {

	public static void main(String[] args) {
		
		String produto1 = "computador";
		String produto2 = "Mesa de escritorio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medir = 53.234567;
		
		System.out.println("Produtos: ");
		System.out.printf("%s, que o preço é: $ %.2f%n", produto1, preco1);
		System.out.printf("%s, que o preço é: $ %.2f%n", produto2, preco2);
		System.out.printf("Registro: %d anos de idade, Codigo: %d, Genêro: %s \n", idade, codigo, genero);
		System.out.printf("Medida com 8 casas decimais: %.8f \n", medir);
		System.out.printf("Arredomdando 3 casas decimais %.3f \n", medir);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.3f ", medir);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
