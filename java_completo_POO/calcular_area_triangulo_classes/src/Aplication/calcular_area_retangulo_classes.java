package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Retangulo;

public class calcular_area_retangulo_classes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.Altura = sc.nextDouble();
		retangulo.Largura = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", retangulo.somarArea());
		System.out.printf("PERIMETER = %.2f%n", retangulo.somaPerimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.somaDiagonal());
		
		
		
		sc.close();

	}

}
