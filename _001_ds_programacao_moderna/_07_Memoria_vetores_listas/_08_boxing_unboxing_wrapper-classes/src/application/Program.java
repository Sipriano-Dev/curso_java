package application;

public class Program {

	public static void main(String[] args) {

		// objeto tipo valor
		int n = 20;
		// colocar um objeto tipo valor(primitivo) em um objeto tipo referencia é
		// chamado de boxing
		Object obj = n;
		System.out.println(obj);// 20

		// o contrário é chamado de unboxing, e precisa usar o cast se for o Object
		int y = (int) obj;
		System.out.println(y);//20
		System.out.println("----------------------------------------------------------------------------");
		
		int n1 = 10;
		//Usando o Wrapper do int no boxing, no umboxing não necessita cast
		Integer obj1 = n1;
		System.out.println(obj1);//10
		//como dito não precisa de cast, o java já reconhece que ta tratando o tipo primitivo como tipo classe
		int y2 = obj1;
		System.out.println(y2);//10

	}

}
