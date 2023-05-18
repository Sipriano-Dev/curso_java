package default_package;

public class Program {

	public static void main(String[] args) {

		String s = "potato apple lemon";

		String[] vect = s.split(" ");
		//declara vetor do tipo string chamado vect q recebe a string s /*split vai
		//usar o que tiver dentro das aspas como referencia /*pra criar uma separação e
		//armazenar o que foi cortado em cada index do vetor

		String word1 = vect[0];//pega o que ta na posição 0 do vetor e armazena na var word
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		System.out.println(vect[0]);//também é possível imprimir direto

	}

}
