package entities;

public class Student {
	
	public String nome;
	public double semestre1;
	public double semestre2;
	public double semestre3;
	
	public double total() {
		return semestre1 + semestre2 + semestre3;
	}
	
	public String resultado() {
		if (total() > 60) {
			return "PASS";
		} else {
			return String.format("FAILED %nFALTARAM %.2f PONTOS", 60 - total());
		}
	}
	
	public String toString() {
		return "NOTA FINAL = " + total() + "\n" + resultado();
	}

}
