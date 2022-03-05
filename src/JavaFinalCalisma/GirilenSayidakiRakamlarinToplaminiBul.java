package JavaFinalCalisma;
import java.util.Scanner;
public class GirilenSayidakiRakamlarinToplaminiBul {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.printf("Lütfen bir sayý giriniz: ");
		int girdi = scan.nextInt();
		sayilariTopla(girdi);
		
		
		
	}
	public static int sayilariTopla(int sayi) 
	{
		int toplam = 0;
		while (sayi > 0) 
		{
			toplam = toplam + sayi % 10;
			sayi = sayi / 10;
		}
		System.out.println(toplam);
		return sayi;
	}

}
