package JavaFinalCalisma;
public class AsalSayilariBul {

	public static void main(String[] args) 
	{
		int girdi = 100;
		IkizAsalSayilar(girdi);
	}
	public static int IkizAsalSayilar(int sayi) 
	{
		while (sayi > 0) 
		{
			if (sayi / 2 != 0 && sayi / 2 != 1) 
			{
				System.out.println(sayi);
			}
			sayi--;
		}
		return sayi;
	}
}
