package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class vender_dolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar: ");
		double valorDolar = sc.nextDouble();
		System.out.println("Quantos dolar gostaria de comprar: ");
		double compraDolar = sc.nextDouble();
		
		System.out.printf("Total a pagar em reais = " 
		+ CurrencyConverter.calculoDolar(valorDolar, compraDolar));
		
		
		sc.close();

	}

}
