package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] rent = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt();
		
		
		for (int i = 1; i <= quantity; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			rent[room] = new Rent(name, email);
		}

		System.out.println();

		System.out.println("Busy rooms");

		for (int i = 0; i < rent.length; i++) {

			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}

		sc.close();
	}
}
