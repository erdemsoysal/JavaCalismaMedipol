package JavaFinalCalisma;
import java.util.Scanner;
public class IkiSayiyiCarpMethod {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.printf("L�tfen ilk sayiyi giriniz: ");
		int aSayisi = scan.nextInt();
		System.out.printf("L�tfen ikinci say�y� giriniz: ");
		int bSayisi = scan.nextInt();
		
		ikiSayiyiCarp(aSayisi, bSayisi);
	}
	public static void ikiSayiyiCarp(int a, int b) 
	{
		System.out.println("Sonuc: " + a +" x "+ b +" = "+ a * b);
	}

}
