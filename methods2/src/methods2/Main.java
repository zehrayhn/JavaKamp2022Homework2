package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		//mesaj.substring(0,2);//bu şekilde kullanılamaz. substring işlemi sonucu yeni bir string değer oluşacağı için onu da string türünde bir değişkene atarız.

		String yeniMesaj=mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		int sayi=topla(5,7);
		String mesaj2=sehirVer();
		int toplam=topla2(1,2,3,4,5);
		System.out.println(toplam);
	}
	
	public static void ekle()
	{
		System.out.println("Eklendi");
		return;//burada da return kullandık ama burası bir değer döndürmüüyor. fonksiyonun bittiği anlamına geliyor.
	}

	public static void sil()
	{
		
	}
	public static int topla(int sayi1,int sayi2)
	{
		return sayi1+sayi2;
		
	}
	public static int topla2(int... sayilar) {//variable arguments (int array gibi çalışır.)
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	
	
}
