package Calisma1;
import java.util.Scanner;


public class JavaCalculator {

	public static void main(String[] args) 
	{
		
		int a,b,islemInput;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("1- Topla\n2- ��kar\n3- �arp\n4- B�l");
		System.out.printf("L�tfen yapmak istedi�iniz i�lemi se�iniz: ");
		islemInput = scan.nextInt();
		
		switch (islemInput) 
		{
		case 1:
			System.out.printf("L�tfen ilk say�y� giriniz: ");
			a = scan.nextInt();
			System.out.printf("L�tfen ikinci say�y� giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonu� = " + (a+b));
			break;
		case 2:
			System.out.printf("L�tfen ilk say�y� giriniz: ");
			a = scan.nextInt();
			System.out.printf("L�tfen ikinci say�y� giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonu� = " + (a-b));
			break;
		case 3:
			System.out.printf("L�tfen ilk say�y� giriniz: ");
			a = scan.nextInt();
			System.out.printf("L�tfen ikinci say�y� giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonu� = " + (a*b));
			break;
		case 4:
			System.out.printf("L�tfen ilk say�y� giriniz: ");
			a = scan.nextInt();
			System.out.printf("L�tfen ikinci say�y� giriniz: ");
			b = scan.nextInt();
			
			System.out.println("Sonu� = " + (a/b));
			break;
		default:
			System.out.println("Hatal� bir i�lem se�tiniz.");
			break;
		}
		
		
		
		
		
		
		

	}

}
