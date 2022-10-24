package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of product: ");
		int n = sc.nextInt();
		List<Product> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported? (c/u/i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			Product p;
			if (type == 'c') {
				p = new Product(name, price);
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				p = new UsedProduct(name, price, sdf.parse(sc.next()));
			} else {
				System.out.print("Custon fee: ");
				p = new ImportedProduct(name, price, sc.nextDouble());
			}
			
			list.add(p);
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		list.forEach(p -> System.out.println(p.priceTag()));
		
		sc.close();

	}

}
