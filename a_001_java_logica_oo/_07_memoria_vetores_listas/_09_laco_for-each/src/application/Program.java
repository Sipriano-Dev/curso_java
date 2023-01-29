package application;

public class Program {

	public static void main(String[] args) {
		//Forma de já instanciar o vetor com os valores
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//forma classica de imprimir o vetor
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------------------");
		//forma nova usando for each
		//"obj" é o apelido de cada elemento do vetor
		for (String obj : vect) {
			System.out.println(obj);
		}
		

	}

}
