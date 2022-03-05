package JavaButCalisma;
import java.util.Scanner;

public class FaktoriyelHesapla {

	public static void main(String[] args) 
	{
		int girdi;
		System.out.print("Lütfen bir sayý giriniz: ");
		Scanner scan = new Scanner(System.in);
		girdi = scan.nextInt();
		
		faktoriyelHesapla(girdi);
	}
	public static void faktoriyelHesapla(int girdi) 
	{
		int faktoriyel = 1;
		for (int i = 1; i <= girdi; i++) 
		{
			faktoriyel = faktoriyel * i;
		}
		System.out.println(faktoriyel);
	}
}
