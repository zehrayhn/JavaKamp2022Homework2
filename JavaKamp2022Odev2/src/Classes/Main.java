package Classes;

public class Main {

	public static void main(String[] args) {
	
		
		CustomerManager customerManager;//=new CustomerManager();//101 REFERANS NUMARASI 
		//CLASS lar referans tiptir.
		CustomerManager customerManager2=new CustomerManager();//102 referans numarası
		customerManager=customerManager2;//customerManager ın referans numarası da 102 olur.yanı yukarıdaki new anlamsız olur.

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value type 
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);//10
		
		//reference type
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);//10
		
		
		
	}

	
}
