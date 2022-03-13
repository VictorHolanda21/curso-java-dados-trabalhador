package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy)");
		
		String departamentName;
		String workerName;
		String workerLevel;
		double baseSalary;
				
		System.out.print("Enter departament's name: ");
		departamentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		System.out.print("Name: ");
		workerName = sc.nextLine();		
		System.out.print("Level: ");
		workerLevel = sc.nextLine();		
		System.out.print("Base salary: ");
		baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(
							workerName, 
							WorkerLevel.valueOf(workerLevel),
							baseSalary,
							new Departament(departamentName)
						);
		
		
		System.out.print("How many contracts to this worker? ");	
		int n = sc.nextInt();
		for (int i=1; i<=n;i++) {
			System.out.println("Enter contract #"+i+" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			worker.addContract(contract);
		}
		
		sc.close();
		
	}

}
