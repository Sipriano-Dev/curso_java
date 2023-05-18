package default_package;

public class Program {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();//coloca tudo em letras minúsculas
		String s02 = original.toUpperCase();//coloca tudo em letras maiúsculas
		String s03 = original.trim();//elimina os espaços nas bordas da string
		String s04 = original.substring(2);//faz uma substring da posição 2 em diante
		String s05 = original.substring(2, 9);//faz uma substring da posição 2 até o 8, n pega o 9
		String s06 = original.replace('a', 'x');//troca tudo q tem a por x
		String s07 = original.replace("abc", "xy");//troca tudo que tiver abc por xy
		int i = original.indexOf("bc");//qual index acontece a primeira ocorrencia do bc
		int j = original.lastIndexOf("bc");//qual index acontece a última ocorrencia do bc
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
