package Class080122;

public class matrisCozum {

	public static void main(String[] args) 
	{
		long [][] dizi = new long[3][3];
				
				int ilkDeger = 2;
				for (int i = 0; i < 3; i++) 
				{
					for (int j = 0; j < 3; j++) 
					{
						dizi[i][j] = faktoriyelHesapla(ilkDeger);
						ilkDeger += 2;
						System.out.print(dizi[i][j] + " ");
					}
					System.out.println();
				}
				
			}
			public static long faktoriyelHesapla(long sayi)
			{
				int sonuc = 1;
				for (long i = 1; i <= sayi; i++) 
				{
					sonuc *= 1;
				}
				return sonuc;
	}

}
