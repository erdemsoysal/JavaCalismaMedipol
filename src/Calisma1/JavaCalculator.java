package Calisma1;
import java.util.Scanner;


public class JavaCalculator {

	public static void main(String[] args) 
	{
		
		int a,b,islemInput;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("1- Topla\n2- Çýkar\n3- Çarp\n4- Böl");
		System.out.printf("Lütfen yapmak istediðiniz iþlemi seçiniz: ");
		islemInput = scan.nextInt();
		
		switch (islemInput) 
		{
		case 1:
			System.out.printf("Lütfen ilk sayýyý giriniz: ");
			a = scan.nextInt();
			System.out.printf("Lütfen ikinci sayýyý giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonuç = " + (a+b));
			break;
		case 2:
			System.out.printf("Lütfen ilk sayýyý giriniz: ");
			a = scan.nextInt();
			System.out.printf("Lütfen ikinci sayýyý giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonuç = " + (a-b));
			break;
		case 3:
			System.out.printf("Lütfen ilk sayýyý giriniz: ");
			a = scan.nextInt();
			System.out.printf("Lütfen ikinci sayýyý giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonuç = " + (a*b));
			break;
		case 4:
			System.out.printf("Lütfen ilk sayýyý giriniz: ");
			a = scan.nextInt();
			System.out.printf("Lütfen ikinci sayýyý giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonuç = " + (a/b));
			break;
		default:
			System.out.println("Hatalý bir iþlem seçtiniz.");
			break;
		}
		
		
		
		
		
		
		

	}

}
