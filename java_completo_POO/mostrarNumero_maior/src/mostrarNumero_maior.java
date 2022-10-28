import java.util.Scanner;

public class mostrarNumero_maior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
		System.out.println("O maior numero é: " + a);
		} else if (b > c) {
		System.out.println("O maior numero é: " + b);
		} else {
		System.out.println("O maior numero é: " + c);
		}
		sc.close();

	}

}
