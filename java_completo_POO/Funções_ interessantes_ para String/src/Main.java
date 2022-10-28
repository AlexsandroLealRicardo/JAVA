
public class Main {

	public static void main(String[] args) {
		// string com texto para editar
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		// deixar as letras minusculas
		String s01 = original.toLowerCase();
		
		// deixar as letras maiusculas
		String s02 = original.toUpperCase();
		
		// elimina espaços em branco ecsedendo no texto
		String s03 = original.trim();
		
		// cria uma nova string a partir do atributo escolhido
		String s04 = original.substring(2);
		
		// recortar a string a partir do 2 abaixo do caracter 9
		String s05 = original.substring(2, 9);
		
		// troca para mim o 'a' pelo 'x'
		String s06 = original.replace('a', 'x');
		
		// substituir palabras
		String s07 = original.replace("abc", "xy");
		
		// descobrir a primeira ocorrencia de uma letra ou palavra
		int i = original.indexOf("bc");
		
		// descobrir a ultima ocorrencia de uma letra ou palavra
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
	}

}
