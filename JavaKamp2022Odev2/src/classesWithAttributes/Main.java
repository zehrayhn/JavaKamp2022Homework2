package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product=new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
	
		Product product2=new Product(1,"laptop","ASUS",3000,2,"Siyah");
		
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		}
	
}
