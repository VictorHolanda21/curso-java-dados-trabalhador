package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String departamentName;
		String workerName;
		String workerLevel;
		double baseSalary;
		
		Worker worker;
		
		
		System.out.print("Enter departament's name: ");
		departamentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		System.out.print("Name: ");
		workerName = sc.nextLine();		
		System.out.print("Level: ");
		workerLevel = sc.nextLine();		
		System.out.print("Base salary: ");
		baseSalary = sc.nextDouble();
		
		worker = new Worker(
							workerName, 
							WorkerLevel.valueOf(workerLevel),
							baseSalary,
							new Departament(departamentName)
						);
		
		sc.close();
		
	}

}
