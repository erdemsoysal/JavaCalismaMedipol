package Class041221;
import java.util.Scanner;
public class methods {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2;
		System.out.printf("L�tfen ilk say�y� giriniz: ");
		sayi1 = scan.nextInt();
		System.out.println();
		
		System.out.printf("L�tfen di�er say�y� giriniz: ");
		sayi2 = scan.nextInt();
		System.out.println();
		
		getTotal(sayi1,sayi2);
		
	}
	
	public static int getTotal(int num1,int num2)
	{
		
		int toplam = num1+num2;
		System.out.println("Toplam = " + toplam);
		return toplam;
	}

}
