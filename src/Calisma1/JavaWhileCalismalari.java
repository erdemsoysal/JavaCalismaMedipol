package Calisma1;
import java.util.Scanner;
public class JavaWhileCalismalari {

	public static void main(String[] args) 
	{
		//girilen say�ya kadar sayan bir program
		/*
		int girdi;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("L�tfen ka�a kadar say�lmas�n� istedi�inizi giriniz: ");
		girdi = scan.nextInt();
		
		while (i <= girdi) 
		{
			System.out.println((float)i); //cast i�lemi int'i float'a �evirdik.
			i++;
		}
		*/
		
		//fakt�riyel hesaplama
		int faktoriyel = 1;
		int girdi;
		int geciciGirdi;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("L�tfen ka� fakt�riyel bulmak istedi�inizi giriniz: ");
		girdi = scan.nextInt();
		
		geciciGirdi = girdi;
		while (geciciGirdi > 1) 
		{
			System.out.println(faktoriyel + " * " + geciciGirdi);
			faktoriyel *= geciciGirdi;
			geciciGirdi--;
		}
		System.out.println(" Fakt�riyel = " + faktoriyel);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
