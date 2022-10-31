package model.exceptions;

// Exception obriga vc a tratar a exceçao, ja RunTimeException nao obriga
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// Para poder instancia uma exception passando uma msg que ficara armazenada na
	// exceçao
	public DomainException(String msg) {
		super(msg);
	}

}
