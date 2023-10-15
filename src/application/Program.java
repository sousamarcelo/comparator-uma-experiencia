package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));
		
		// comparator com classe com lambda, segunda versão, mas da para melhorar
		Comparator<Product> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());				
		
		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
