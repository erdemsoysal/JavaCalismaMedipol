package JavaFinalCalisma;
import java.util.Scanner;
public class SayilarinOrtalamasiniBul {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("L�tfen ilk say�y� giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.printf("L�tfen ikinci say�y� giriniz: ");
		int sayi2 = scan.nextInt();
		System.out.printf("L�tfen ���nc� say�y� giriniz: ");
		int sayi3 = scan.nextInt();
		
		ortalamaBul(sayi1, sayi2, sayi3);
		
	}
	public static int ortalamaBul(int sayi1, int sayi2, int sayi3) 
	{
		int ortalama = (sayi1 + sayi2 + sayi3) / 3;
		System.out.println("ortalama: " + ortalama);
		return ortalama;
	}

}
