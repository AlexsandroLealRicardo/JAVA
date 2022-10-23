package DiasDaSemana;

import java.util.Locale;
import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Segunda";
			break;
		case 2:
			dia = "Terça";
			break;
		case 3:
			dia = "Quarta";
			break;
		case 4:
			dia = "Quinta";
			break;
		case 5:
			dia = "Sexta";
			break;
		case 6:
			dia = "Sabado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.printf("O dia escolhido é: %s%n", dia);
		
		sc.close();

	}

}
