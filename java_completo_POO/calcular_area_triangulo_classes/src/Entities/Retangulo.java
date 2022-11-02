package Entities;

public class Retangulo {
	
	public double Largura;
	public double Altura;
	
	public double somarArea() {
		return Largura * Altura;
	}
	
	public double somaPerimetro() {
		return 2.0 * (Largura + Altura);
	}
	
	public double somaDiagonal() {
		return Math.sqrt(Largura * Largura + Altura * Altura);
	}
		
	}

