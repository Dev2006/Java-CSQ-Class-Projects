import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Store {
	private static TreeMap<Integer, Product> products = new TreeMap<>();
	
	//Initializes TreeMap with data from file
	public Store() {
		File f = new File(".\\src\\flipkart_ecom_data.csv");
		
		try {
			Scanner fileSc = new Scanner(f);
			
			while (fileSc.hasNext()) {
				Scanner sc = new Scanner(fileSc.nextLine());
				sc.useDelimiter(",");
				
				int ID;
				String name;
				int retailPrice;
				int discountedPrice;
				String brand;
				
				ID = Integer.parseInt(sc.next());
				
				try {
					name = sc.next();
				} catch (Exception e) {
					name = " ";
				}
				
				try {
					retailPrice = Integer.parseInt(sc.next());
				} catch (Exception e) {
					retailPrice = 0;
				}
				
				try {
					discountedPrice = Integer.parseInt(sc.next());
				} catch (Exception e) {
					discountedPrice = 0;
				}
				
				try {
					brand = sc.next();
				} catch (Exception e) {
					brand = " ";
				}
				
				products.put(ID, new Product(name, retailPrice, discountedPrice, brand));
				sc.close();
			}
			
			fileSc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Lists all the elements of products
	public void list() {
		
		for (Map.Entry<Integer, Product> ent : products.entrySet()) {
			int ID = ent.getKey();
			String pName = ent.getValue().getProductName();
			
			System.out.println("Product " + ID + " : " + pName);
		}	
	}
	
	//List details of a element of products
	public void detail(int ID) throws ProductNotFoundException {
		Product p = products.get(ID);
		
		if (p != null)
			System.out.println("Product " + ID + '\n' + p);
		else
			throw new ProductNotFoundException("No listed product has ID " + ID);
	}
}
