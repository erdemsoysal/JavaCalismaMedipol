package JavaFinalCalisma;
import java.util.Scanner;
public class karesiniAlMethodu {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.printf("Lütfen bir sayý giriniz: ");
		int girdi = scan.nextInt();
		karesiniAl(girdi);
	}
	
	public static void karesiniAl(int sayi) 
	{
		System.out.println("Sonuc: " + sayi +" x "+ sayi +" = "+ sayi * sayi);
	}
	
}
