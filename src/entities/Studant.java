package entities;

public class Studant {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void finalPoints(double n1, double n2, double n3) {
		double soma = 0;
		double dif = 0;
		soma = n1 + n2 + n3;
		if (soma >= 60.00) {
			System.out.printf("FINAL GRADE = %.2f%n", soma);
			System.out.println("PASS");
		}
		else {
			dif = 60.00 - soma;
			System.out.printf("FINAL GRADE = %.2f%n", soma);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f", dif);
			System.out.println(" POINTS");
		}
	}
}
