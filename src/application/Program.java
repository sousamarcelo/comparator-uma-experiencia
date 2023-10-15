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
		
		// forma mais simplificada de utilizar a classe comparator com lambda, nesse exemplo foi utilizado diretamente dentro do medoto sort		
		list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
