package entities;

public class Triangle {
	// delegando a responsabilidade do método de calculo para a classe triângulo,
	// fazendo isso reaproveitamos o código, tirando as repetições e dele
	// delegar a classe responsável é o princípio de coesão

	public double a;// esse é um atributo da classe,
	public double b;// public pode ser usado por outros arquivos
	public double c;

	// double diz que será retornado um double, se não retornase nada seria void,
	// area é o nome não tem nada entre () pois o que o metodo vai usar já estão na
	// classe no caso os atributos a, b e c, se fosse precisar receber algo de fora
	// precisaria colocar nos parenteses

	public double area() {// corpo do método
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
