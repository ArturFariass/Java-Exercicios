package entities;

public class Student {

	public String name;
	public double notaUm;
	public double notaDois;
	public double notaTres;
	
	public double nota() {
		return notaUm + notaDois + notaTres;
	}
	
	public double missingPoints() {
		if (nota() < 60.0) {
			return 60.0 - nota();
		}
		else
			return 0.0;
	}
	
}
