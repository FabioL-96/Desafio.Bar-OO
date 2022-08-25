package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill orderNote = new Bill();

		do {
			System.out.print("Sexo: ");
			orderNote.gender = sc.next().charAt(0);
		} while (orderNote.gender != 'M' && orderNote.gender != 'F');

		System.out.print("Quantidade de cervejas: ");
		orderNote.beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		orderNote.softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		orderNote.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO: ");

		System.out.printf("Consumo = R$ %.2f\n", orderNote.feeding());
		if (orderNote.cover() == 4.0) {
			System.out.println("Couvert = R$ 4.00");
		} else {
			System.out.println("Isento de Couvert");
		}
		System.out.printf("Ingresso = R$ %.2f\n", orderNote.ticket());

		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f\n", orderNote.total());
		sc.close();
	}

}
