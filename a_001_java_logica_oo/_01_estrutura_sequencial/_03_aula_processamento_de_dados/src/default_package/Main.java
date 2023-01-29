package default_package;

public class Main {

	public static void main(String[] args) {
		/*
		 * Exemplo 1 int x, y;
		 * 
		 * x = 5; //"=" O sinal "=" indica que a var x ta recebendo 5 
		 * y = 2 * x; // A var y ta recebendo 2 x 5, ja que x contem 5 
		 * System.out.println(x); 
		 * System.out.println(y);
		 */
//------------------------------------------------ ----------------------

		/*
		 * Example 2 
		 * int x; double y; 
		 * x = 5; 
		 * y = 2 * x; // Como y eh do tipo double o valor sera 10.0 e nao 10 
		 * System.out.println(x); System.out.println(y); //10.0
		 */
//------------------------------------------------ -----------------------

		/*
		 * Example 3 
		 * double b, B, h, 
		 * area; b = 6.0; // Boa pratica usar .0 em double e 6f em float
		 * B = 8.0; 
		 * h = 5.0; 
		 * area = (b + B) / 2.0 * h;
		 * System.out.println(area);
		 */
//------------------------------------------------ -----------------------

		/*
		 * Example 4
		 * int a, b; double result; 
		 * a = 5; 
		 * b = 2; 
		 * result = a / b; //Corta o decima que seria 2.5 e coloca int 2.0 ja que esta dividindo 2 integer
		 * result = (double) a / b; // Faz um cast, avisando que nao eh pra corta o decimal, int cabe em float ou double
		 * converts to double System.out.println(result);
		 */
//------------------------------------------------ -------------------------

//Example 5
		double a;
		int b;
		a = 5.0;
		//b = a; //Nao aceita naturalmente pois o int e menor que o float e n cabe
		b = (int) a; // Cast forca a receber avisando que tudo bem, mas vai perder os decimais
		System.out.println(b);

	}

}