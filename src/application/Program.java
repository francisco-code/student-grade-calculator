package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant grade = new Studant();
		
		System.out.print("NOME DO ALUNO: ");
		grade.name = sc.nextLine();
		grade.nota1 = sc.nextDouble();
		grade.nota2 = sc.nextDouble();
		grade.nota3 = sc.nextDouble();

		grade.finalPoints(grade.nota1, grade.nota2, grade.nota3);
		
		sc.close();
	}

}
