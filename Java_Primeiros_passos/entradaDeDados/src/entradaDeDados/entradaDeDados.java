package entradaDeDados;

import java.util.Scanner; // pacote para escanear valores de entrada.

public class entradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Variavel que define o scanner
		
		String x;
		int y;
		Double n;
		char o;
		String a, b, c;
		
		System.out.println("Digite um texto: ");
		x = sc.next(); // Variavel que armazena um valor de texto
		System.out.println("Você digitou: " + x);
		
		System.out.println("Digite o valor de um numero inteiro: ");
		y = sc.nextInt(); // Variavel que armazena um valor de numero inteiro
		System.out.println("Você digitou:" + y);
		
		System.out.println("Digite o valor decimal: ");
		n = sc.nextDouble(); // Variavel que armazena um valor de numero com ponto flutuante
		System.out.println("Você digitou: " + n);
		
		System.out.println("Digite apenas uma Letra: ");
		o = sc.next().charAt(0); // Variavel que armazena um valor de a penas uma caracteria
		System.out.println("Você digitou: " + o);
		
		System.out.println("Digite varias frases: ");
		sc.nextLine(); // pulo do gato para usar o line corretamente.
		a = sc.nextLine(); // Variavel que armazena valor em toda a linha
		b = sc.nextLine(); // Variavel que armazena valor em toda a linha
		c = sc.nextLine(); // Variavel que armazena valor em toda a linha
		System.out.println("Você digitou: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close(); // Finaliza o evento de escaneamento
	

	}

}
