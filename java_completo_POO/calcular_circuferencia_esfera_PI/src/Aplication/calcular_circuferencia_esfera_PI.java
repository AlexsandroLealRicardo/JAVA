package Aplication;

import java.util.Scanner;

import util.Calcular;

public class calcular_circuferencia_esfera_PI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calcular calc = new Calcular();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

	}

}
