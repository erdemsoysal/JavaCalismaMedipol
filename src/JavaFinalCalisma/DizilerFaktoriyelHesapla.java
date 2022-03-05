package JavaFinalCalisma;

public class DizilerFaktoriyelHesapla {

	public static void main(String[] args) 
	{
		long[][] dizi = new long[3][3];
		
		long girisDeger = 2;
		
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				dizi[i][j] = faktoriyelHesapla(girisDeger);
				girisDeger += 2;
				System.out.println(dizi[i][j]);
			}
		}
	}
	public static long faktoriyelHesapla(long dizi) 
	{
		long sonuc = 1;
		for (long i = 1; i <= dizi; i++) 
		{
			sonuc *= i;
		}
		return sonuc;
	}
}