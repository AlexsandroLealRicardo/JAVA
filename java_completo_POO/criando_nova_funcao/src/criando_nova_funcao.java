import java.util.Scanner;

public class criando_nova_funcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// armazena os valores inseridos nas variaveis
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// chama as funções criadas
		int maior = max(a, b, c);
		mostrarResultado(maior);
		
		sc.close();

	}
	 // Função max
	public static int max(int d, int e, int f) {
		int aux;
		if (d > e & d > f) {
			aux = d;
		} else if(e > f) {
			aux = e;
		} else {
			aux = f;
		}
		return aux;
	}
	
	// Função mostrarResultado
	public static void mostrarResultado(int valor) {
		System.out.println("O maior valor é: " + valor);
	}

}
