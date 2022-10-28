
public class operacao_split {

	public static void main(String[] args) {
		
		// codigo que separa as palavras de uma frase por um delimitador e armazena em um vetor
		
		// declarando a variavel com o texto
		String s = "potato apple lemon";
		
		// criando o vetor com o texto recortado da variavel 's'
		String[] vect = s.split(" ");
		
		// setando os vetores com as posicoes das palavras armazenadas
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		// imprimindo as palavras concatenadas
		System.out.println(word1 + " " + word2 + " " + word3);
		System.out.println();
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
